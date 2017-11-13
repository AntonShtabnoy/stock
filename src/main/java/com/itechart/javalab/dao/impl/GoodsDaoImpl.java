package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.GoodsDao;
import com.itechart.javalab.data.entity.Goods;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@Repository
@Transactional
public class GoodsDaoImpl extends BaseDao implements GoodsDao {

    public GoodsDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void save(Goods entity) {
        currentSession().save(entity);
    }
}
