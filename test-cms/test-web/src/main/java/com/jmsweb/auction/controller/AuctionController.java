package com.jmsweb.auction.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuctionController {

    @RequestMapping(path="auctionItems", method=RequestMethod.GET)
    public List<String> getAuctionItems() {
        List<String> sample = new ArrayList<>();
        sample.add("HAHA NEW STRING AUCTION");
        return sample;
    }

    @RequestMapping(path="auctionItems", method=RequestMethod.POST)
    public String newAuctionItem(@RequestBody String auctionItem) {
        return auctionItem;
    }

    @RequestMapping(path="auctionItems/{auctionItemId}", method=RequestMethod.GET)
    public String getAuctionItem(@PathVariable("auctionItemId") String auctionItemId) {
        return auctionItemId;
    }

    @RequestMapping(path="bids", method=RequestMethod.POST)
    public String bidAuctionItem(@RequestBody String bid) {
        return bid;
    }
}