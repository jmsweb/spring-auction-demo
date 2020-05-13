import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AuctionListComponent } from './auction-list/auction-list.component';
import { AuctionFormComponent } from './auction-form/auction-form.component';
import { AuctionService } from './service/auction.service';
import { BidFormComponent } from './bid-form/bid-form.component';
import { BidService } from './service/bid.service';
import { AuctionItemComponent } from './auction-item/auction-item.component';

@NgModule({
    declarations: [
        AppComponent,
        AuctionListComponent,
        AuctionFormComponent,
        BidFormComponent,
        AuctionItemComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
    providers: [AuctionService, BidService],
    bootstrap: [AppComponent]
})

export class AppModule { }
