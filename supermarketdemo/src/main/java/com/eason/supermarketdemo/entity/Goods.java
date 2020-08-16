package com.eason.supermarketdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author: liyishan
 * @Date: 2020/8/16 17:31
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsNo;

    private String name;

    private BigDecimal price;

    private Integer nums;

    private Integer state;
}


