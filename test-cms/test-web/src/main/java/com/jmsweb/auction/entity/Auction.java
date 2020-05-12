package com.jmsweb.auction.entity;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Digits;

@Entity
public class Auction {

    @Id
    @SequenceGenerator(name="auction_sequence", sequenceName = "auction_seq", allocationSize=1, initialValue=1000)
    @GeneratedValue(generator="auction_sequence", strategy=GenerationType.SEQUENCE)
    private Long auctionItemId;

    @Digits(integer=10, fraction=2)
    private BigDecimal currentBid = BigDecimal.ZERO;

    @Digits(integer=10, fraction=2)
    private BigDecimal reservePrice = BigDecimal.ZERO;

    @OneToOne(targetEntity=Item.class, cascade=CascadeType.ALL)
    private Item item;

    @OneToOne(targetEntity=Bid.class, cascade=CascadeType.ALL)
    private Bid bid;

    public Long getAuctionItemId() {
        return auctionItemId;
    }

    public void setAuctionItemId(Long auctionItemId) {
        this.auctionItemId = auctionItemId;
    }

    public BigDecimal getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(BigDecimal currentBid) {
        this.currentBid = currentBid;
    }

    public BigDecimal getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(BigDecimal reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }
}