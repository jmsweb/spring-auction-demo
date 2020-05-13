export class Auction {
    auctionItemId: string;
    currentBid: any;
    maxAutoBidAmount: any;
    bidderName: string;
    reservePrice: any;
    item: Item;
}

export class Item {
    itemId: string;
    description: string;
}
