package com.seata.stock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.stock.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao extends BaseMapper<Product> {
    public void updateCount(Long id);
}
