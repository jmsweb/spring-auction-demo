package com.jmsweb.auction.entity;

import java.math.BigDecimal;

import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;

public class Bid {

    @OneToOne(targetEntity=Auction.class)
    private Auction auction;

    @Digits(integer=10, fraction=2)
    private BigDecimal maxAutoBidAmount = BigDecimal.ZERO;

    private String bidderName;

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public BigDecimal getMaxAutoBidAmount() {
        return maxAutoBidAmount;
    }

    public void setMaxAutoBidAmount(BigDecimal maxAutoBidAmount) {
        this.maxAutoBidAmount = maxAutoBidAmount;
    }

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }
}