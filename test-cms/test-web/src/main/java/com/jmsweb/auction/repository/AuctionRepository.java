package com.jmsweb.auction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmsweb.auction.entity.Auction;
import com.jmsweb.auction.repository.projection.BidDetail;
import com.jmsweb.auction.repository.projection.AuctionIdentifier;
import com.jmsweb.auction.repository.projection.AuctionDetail;

@Repository
public interface AuctionRepository extends CrudRepository<Auction, Long> {
    AuctionIdentifier getIdentifierByAuctionItemId(Long auctionItemId);
    AuctionDetail getAuctionDetailByAuctionItemId(Long auctionItemId);
    BidDetail getBidDetailByAuctionItemId(Long auctionItemId);
}