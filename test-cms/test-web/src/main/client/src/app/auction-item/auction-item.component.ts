import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Auction } from '../model/auction';
import { Item } from '../model/auction';
import { AuctionService } from '../service/auction.service';

@Component({
    selector: 'app-auction-item',
    templateUrl: './auction-item.component.html',
    styleUrls: ['./auction-item.component.css']
})
export class AuctionItemComponent implements OnInit {

    auction: Auction;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private auctionService: AuctionService
    ) {
        this.auction = new Auction();
        this.auction.item = new Item();
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
