package com.seata.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<Order> {

}
