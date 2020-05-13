package com.jmsweb.auction.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmsweb.auction.entity.Auction;
import com.jmsweb.auction.repository.AuctionRepository;
import com.jmsweb.auction.repository.projection.BidDetail;
import com.jmsweb.auction.repository.projection.AuctionDetail;
import com.jmsweb.auction.repository.projection.AuctionIdentifier;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class AuctionController {

    private final AuctionRepository auctionRepository;
    private Logger logger = LoggerFactory.getLogger(AuctionController.class);

    public AuctionController(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    @RequestMapping(path="auctionItems", method=RequestMethod.GET)
    public List<Auction> getAuctionItems() {
        return (List<Auction>) auctionRepository.findAll();
    }

    @RequestMapping(path="auctionItems", method=RequestMethod.POST)
    public AuctionIdentifier newAuctionItem(@RequestBody Auction auctionItem) {
        Auction auction = auctionRepository.save(auctionItem);
        return auctionRepository.getIdentifierByAuctionItemId(auction.getAuctionItemId());
    }

    @RequestMapping(path="auctionItems/{auctionItemId}", method=RequestMethod.GET)
    public AuctionDetail getAuctionItem(@PathVariable("auctionItemId") String auctionItemId) {
        AuctionDetail detail = null;
        if (auctionItemId == null) {
            return null;
        }

        try {
            long id = Long.parseLong(auctionItemId);
            detail = auctionRepository.getAuctionDetailByAuctionItemId(id);
        } catch (NumberFormatException exception) {
            logger.error("[AuctionController::getAuctionItem] encountered non-numerical value [{}] for identifier", auctionItemId);
            return null;
        }

        return detail;
    }

    @RequestMapping(path="bids", method=RequestMethod.POST)
    public BidDetail bidAuctionItem(@RequestBody Auction auctionBid) {

        Auction verifyAuction = auctionRepository.findById(auctionBid.getAuctionItemId()).get();
        if (verifyAuction == null) {
            logger.error("[AuctionController::bidAuctionItem] encountered empty object [{}] for identifier", auctionBid.getAuctionItemId());
            return null;
        }

        BigDecimal reservePrice = verifyAuction.getReservePrice();
        BigDecimal currentPrice = verifyAuction.getCurrentBid();
        BigDecimal submitPrice = auctionBid.getMaxAutoBidAmount();

        if (submitPrice.compareTo(reservePrice) == -1) {
            logger.info("Reserve Price {} is higher than Max Auto Bid Amount {}", reservePrice, submitPrice);
            return null;
        }

        if (submitPrice.compareTo(currentPrice) == -1) {
            logger.info("Current Price {} is higher than Max Auto Bid Amount {}", currentPrice, submitPrice);
            return null;
        }

        if (submitPrice.subtract(currentPrice).compareTo(new BigDecimal(1)) == -1 || submitPrice.subtract(reservePrice).compareTo(new BigDecimal(1)) == -1) {
            logger.info("Current Price {} or Reserve Price {} is a dollar under Max Auto Bid Amount {}", currentPrice, reservePrice, submitPrice);
            return null;
        }

        String message = String.format(
                "Attempt bid by %s for auction #%s with amount of $%.2f, updated Current Price to %.2f",
                auctionBid.getBidderName(),
                auctionBid.getAuctionItemId(),
                submitPrice,
                submitPrice
        );
        logger.info("[AuctionController::bidAuctionItem] {}", message);

        verifyAuction.setCurrentBid(auctionBid.getMaxAutoBidAmount());
        verifyAuction.setBidderName(auctionBid.getBidderName());

        verifyAuction = auctionRepository.save(verifyAuction);
        return auctionRepository.getBidDetailByAuctionItemId(verifyAuction.getAuctionItemId());
    }
}