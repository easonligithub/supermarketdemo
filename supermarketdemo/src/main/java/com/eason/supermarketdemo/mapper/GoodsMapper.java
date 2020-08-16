package com.eason.supermarketdemo.mapper;

import com.eason.supermarketdemo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: liyishan
 * @Date: 2020/8/16 17:32
 * @Description:
 */

@Mapper
@Repository
public interface GoodsMapper {

    List<Goods> queryAll();
}


