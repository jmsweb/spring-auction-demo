import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BidService } from '../service/bid.service';
import { AuctionService } from '../service/auction.service';
import { Auction } from '../model/auction';
import { Bid } from '../model/bid';

@Component({
    selector: 'app-bid-form',
    templateUrl: './bid-form.component.html',
    styleUrls: ['./bid-form.component.css']
})
export class BidFormComponent implements OnInit {

    auction: Auction;
    bid: Bid;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private auctionService: AuctionService,
        private bidService: BidService
    ) {
        this.auction = new Auction();
        this.bid = new Bid();
    }

    onSubmit() {
        this.auction.bidderName = this.bid.bidderName;
        this.auction.maxAutoBidAmount = this.bid.maxAutoBidAmount;
        this.bidService.save(this.auction).subscribe(result => this.gotoAuctionList());
    }

    gotoAuctionList() {
        this.router.navigate(['/show-auctions']);
    }

    ngOnInit(): void {
        this.route.paramMap.subscribe(
            params => {
                this.auction.auctionItemId = params.get('id');
            }
        );

        this.auctionService.find(this.auction.auctionItemId).subscribe(
            data => {
                this.auction = data;
                this.auction.item = data.item;
            }
        );
    }
}