package com.seata.stock.controller;

import com.seata.stock.entity.Product;
import com.seata.stock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/kucun")
    public String order(){
        productService.updateCount();
        return "修改成功";
    }

}
