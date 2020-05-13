import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Auction } from '../model/auction';
import { Observable } from 'rxjs';

@Injectable()
export class AuctionService {

    private auctionUrl: string;

    constructor(private http: HttpClient) {
        this.auctionUrl = "http://localhost:8080/auctionItems";
    }

    public findAll(): Observable<Auction[]> {
        return this.http.get<Auction[]>(this.auctionUrl);
    }

    public find(auctionItemId: string): Observable<Auction> {
        return this.http.get<Auction>(`${this.auctionUrl}/${auctionItemId}`);
    }

    public save(auction: Auction) {
        return this.http.post<Auction>(this.auctionUrl, auction);
    }
}
