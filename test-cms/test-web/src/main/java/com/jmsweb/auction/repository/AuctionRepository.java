package com.jmsweb.auction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmsweb.auction.entity.Auction;
import com.jmsweb.auction.repository.projection.AuctionItemId;

@Repository
public interface AuctionRepository extends CrudRepository<Auction, Long> {
    AuctionItemId findByAuctionItemId(Long auctionItemId);
}