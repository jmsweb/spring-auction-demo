import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Auction } from '../model/auction';

@Injectable()
export class BidService {

    private auctionUrl: string;

    constructor(private http: HttpClient) {
        this.auctionUrl = "http://localhost:8080/bids";
    }

    public save(auction: Auction) {
        return this.http.post<Auction>(this.auctionUrl, auction);
    }
}