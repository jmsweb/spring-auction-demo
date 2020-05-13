import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Bid } from '../model/bid';

@Injectable()
export class BidService {

    private auctionUrl: string;

    constructor(private http: HttpClient) {
        this.auctionUrl = "http://localhost:8080/bids";
    }

    public save(bid: Bid) {
        return this.http.post<Bid>(this.auctionUrl, bid);
    }
}