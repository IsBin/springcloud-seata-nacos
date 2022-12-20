package com.seata.order.service.impl;

import com.seata.order.dao.OrderDao;
import com.seata.order.entity.Order;
import com.seata.order.service.OrderService;
import com.seata.order.service.openfeign.StockFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StockFeignService stockFeignService;

    @Override
//    @Transactional
    @GlobalTransactional
    public void save(Order order) {
        orderDao.insert(order);

//        int i = 1/0;//定义异常

        String s = stockFeignService.updateCount();
        System.out.println(s);
    }
}
