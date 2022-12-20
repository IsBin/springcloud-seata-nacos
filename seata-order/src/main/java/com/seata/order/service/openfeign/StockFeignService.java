package com.seata.order.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "seata-stock",path = "seata-stock/stock")
public interface StockFeignService {

    @PostMapping("/kucun")
    public String updateCount();

}
