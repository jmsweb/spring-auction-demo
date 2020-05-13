package com.jmsweb.auction.repository.projection;

import java.math.BigDecimal;

public interface AuctionDetail {
    String getAuctionItemId();
    String getBidderName();
    BigDecimal getCurrentBid();
    BigDecimal getReservePrice();
    ItemDetail getItem();

    interface ItemDetail {
        String getItemId();
        String getDescription();
    }
}