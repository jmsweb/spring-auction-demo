import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuctionListComponent } from './auction-list/auction-list.component';
import { AuctionFormComponent } from './auction-form/auction-form.component';
import { BidFormComponent } from './bid-form/bid-form.component';
import { AuctionItemComponent } from './auction-item/auction-item.component';

const routes: Routes = [
    { path: 'show-auctions', component: AuctionListComponent },
    { path: 'new-auction', component: AuctionFormComponent },
    { path: 'bid-item/:id', component: BidFormComponent },
    { path: 'auction-item/:id', component: AuctionItemComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }