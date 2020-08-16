package com.eason.supermarketdemo.service.impl;

import com.eason.supermarketdemo.entity.Goods;
import com.eason.supermarketdemo.mapper.GoodsMapper;
import com.eason.supermarketdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: liyishan
 * @Date: 2020/8/16 17:36
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> queryAll() {
        return goodsMapper.queryAll();
    }
}


