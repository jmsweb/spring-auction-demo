import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuctionService } from '../service/auction.service';
import { Auction } from '../model/auction';
import { Item } from '../model/auction';

@Component({
    selector: 'app-auction-form',
    templateUrl: './auction-form.component.html',
    styleUrls: ['./auction-form.component.css']
})
export class AuctionFormComponent implements OnInit {

    auction: Auction;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private auctionService: AuctionService
    ) {
        this.auction = new Auction();
        this.auction.item = new Item();
    }

    onSubmit() {
        this.auctionService.save(this.auction).subscribe(result => this.gotoAuctionList());
    }

    gotoAuctionList() {
        this.router.navigate(['/show-auctions']);
    }

    ngOnInit(): void { }
}