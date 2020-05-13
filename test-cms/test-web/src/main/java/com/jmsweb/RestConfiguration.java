package com.jmsweb;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.jmsweb.auction.entity.Auction;
import com.jmsweb.auction.entity.Item;
import com.jmsweb.auction.repository.AuctionRepository;

@SpringBootApplication
public class RestConfiguration extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RestConfiguration.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestConfiguration.class);
    }

    @Bean
    public CommandLineRunner init(AuctionRepository auctionRepository) {
        return args -> {
            Auction auction1 = new Auction();
            auction1.setReservePrice(new BigDecimal(10450.00));
            auction1.setItem(new Item("abcd", "abcd item description"));
            auctionRepository.save(auction1);

            Auction auction2 = new Auction();
            auction2.setReservePrice(new BigDecimal(2499.00));
            auction2.setCurrentBid(new BigDecimal(2950.00));
            auction2.setBidderName("ABC Dealership");
            auction2.setItem(new Item("efgh", "efgh item description"));
            auctionRepository.save(auction2);

            auctionRepository.findAll().forEach(System.out::println);
        };
    }
}