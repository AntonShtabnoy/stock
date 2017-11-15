package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Goods;

/**
 * Created by Yauhen Malchanau on 15.11.2017.
 */
public interface GoodsDao extends GenericDao<Goods> {

    Goods findByName(String name);
}
