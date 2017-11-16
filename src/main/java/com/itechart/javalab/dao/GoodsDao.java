package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Goods;

import java.util.List;

/**
 * Created by Yauhen Malchanau on 15.11.2017.
 */
public interface GoodsDao extends GenericDao<Goods> {

    List<Goods> findByCriteria(Goods criteria);
    Goods findByName(String name);
}
