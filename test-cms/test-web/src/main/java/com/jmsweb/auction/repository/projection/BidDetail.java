package com.jmsweb.auction.repository.projection;

import java.math.BigDecimal;

public interface BidDetail {
    String getAuctionItemId();
    BigDecimal getMaxAutoBidAmount();
    String getBidderName();
}