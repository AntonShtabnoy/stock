package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.GoodsDao;
import com.itechart.javalab.data.entity.Goods;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@Repository
public class GoodsDaoImpl extends BaseDao implements GoodsDao {

    @Autowired
    public GoodsDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void save(Goods entity) {
        currentSession().save(entity);
    }
}
