package com.seata.order.controller;

import com.seata.order.entity.Order;
import com.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/xiadan")
    public String order(@RequestBody Order order){
        order.setCreateTime(new Date());
        orderService.save(order);
        return "下单成功";
    }

}
