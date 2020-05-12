package com.jmsweb.auction.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmsweb.auction.entity.Auction;
import com.jmsweb.auction.repository.AuctionRepository;
import com.jmsweb.auction.repository.projection.AuctionItemId;

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
    public AuctionItemId newAuctionItem(@RequestBody Auction auctionItem) {
        Auction auction = auctionRepository.save(auctionItem);
        return auctionRepository.findByAuctionItemId(auction.getAuctionItemId());
    }

    @RequestMapping(path="auctionItems/{auctionItemId}", method=RequestMethod.GET)
    public Optional<Auction> getAuctionItem(@PathVariable("auctionItemId") String auctionItemId) {
        Optional<Auction> auction = auctionRepository.findById(Long.parseLong(auctionItemId));
        return auction;
    }

    @RequestMapping(path="bids", method=RequestMethod.POST)
    public String bidAuctionItem(@RequestBody String bid) {
        return bid;
    }
}