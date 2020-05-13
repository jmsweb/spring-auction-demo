import { Component } from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

export class AppComponent {
    title: string;
    developer: string;

    constructor() {
        this.title = 'Spring Boot - Angular Auction Demo';
        this.developer = 'Jason Schwebke';
    }
}