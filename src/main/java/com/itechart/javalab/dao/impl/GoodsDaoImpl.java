package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.GoodsDao;
import com.itechart.javalab.data.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 * Created by Yauhen Malchanau on 15.11.2017.
 */
@Repository
public class GoodsDaoImpl extends BaseDao implements GoodsDao {

    @Autowired
    public GoodsDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public void save(Goods entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public Goods findById(long id) {
        return getEntityManager().find(Goods.class, id);
    }

    @Override
    public void update(Goods entity) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Goods findByName(String name) {
        final String FIND_BY_NAME = "select g from Goods g where g.name=:name";
        Query query = getEntityManager().createQuery(FIND_BY_NAME).setParameter("name", name);
        return (Goods) query.getSingleResult();
    }
}
