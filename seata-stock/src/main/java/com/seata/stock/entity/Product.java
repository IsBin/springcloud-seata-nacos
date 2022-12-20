package com.seata.stock.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("product")
public class Product {
    @TableId
    private Long id;
    private String name;
    private Integer count;
}
