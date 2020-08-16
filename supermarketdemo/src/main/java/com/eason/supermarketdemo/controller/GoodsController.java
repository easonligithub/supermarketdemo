package com.eason.supermarketdemo.controller;

import com.eason.supermarketdemo.entity.Goods;
import com.eason.supermarketdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: liyishan
 * @Date: 2020/8/16 17:30
 * @Description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/all")
    public List<Goods> queryAll(){
        return goodsService.queryAll();
    }
}


