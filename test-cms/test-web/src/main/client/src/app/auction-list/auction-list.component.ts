import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Auction } from '../model/auction';
import { AuctionService } from '../service/auction.service';

@Component({
    selector: 'app-auction-list',
    templateUrl: './auction-list.component.html',
    styleUrls: ['./auction-list.component.css']
})
export class AuctionListComponent implements OnInit {

    auctions: Auction[];

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private auctionService: AuctionService
    ) {
        
    }

    ngOnInit(): void {
        this.auctionService.findAll().subscribe(
            data => {
                this.auctions = data;
            }
        );
    }
}
