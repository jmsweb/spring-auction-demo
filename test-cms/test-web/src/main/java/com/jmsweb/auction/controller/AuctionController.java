package com.jmsweb.auction.controller;

import java.util.List;

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
        return auctionRepository.getAuctionDetailByAuctionItemId(Long.parseLong(auctionItemId));
    }

    @RequestMapping(path="bids", method=RequestMethod.POST)
    public BidDetail bidAuctionItem(@RequestBody Auction auctionBid) {
        Auction auction = auctionRepository.save(auctionBid);
        return auctionRepository.getBidDetailByAuctionItemId(auction.getAuctionItemId());
    }
}