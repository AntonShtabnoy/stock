package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.DriverDao;
import com.itechart.javalab.data.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Ilya Pavlovsky on 11/16/2017
 */
public class DriverDaoImpl extends BaseDao implements DriverDao {

    @Autowired
    public DriverDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public void save(Driver entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public Driver findById(long id) {
       return (Driver) getEntityManager().find(Driver.class, id);
    }

    @Override
    public void update(Driver entity) {

    }

    @Override
    public void delete(long id) {
        EntityManager entityManager = getEntityManager();

        Driver driver = entityManager.find(Driver.class, id);
        if (driver != null) {
            getEntityManager().remove(driver);
        }
    }
}
