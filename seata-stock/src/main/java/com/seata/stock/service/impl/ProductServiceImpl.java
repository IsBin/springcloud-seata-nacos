package com.seata.stock.service.impl;

import com.seata.stock.dao.ProductDao;
import com.seata.stock.entity.Product;
import com.seata.stock.service.ProductService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
//    @Transactional
    @GlobalTransactional
    public void updateCount() {
        productDao.updateCount(1L);
    }
}
