package com.seata.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SeataStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStockApplication.class, args);
    }

}
