import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BidService } from '../service/bid.service';
import { Bid } from '../model/bid';

@Component({
    selector: 'app-bid-form',
    templateUrl: './bid-form.component.html',
    styleUrls: ['./bid-form.component.css']
})
export class BidFormComponent implements OnInit {

    bid: Bid;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private bidService: BidService
    ) {
        this.bid = new Bid();
    }

    onSubmit() {
        this.bidService.save(this.bid).subscribe(result => this.gotoAuctionList());
    }

    gotoAuctionList() {
        this.router.navigate(['/show-auctions']);
    }

    ngOnInit(): void { }
}