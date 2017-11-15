package com.itechart.javalab.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@Repository
public class BaseDao {

    private final EntityManagerFactory en;

    @Autowired
    public BaseDao(EntityManagerFactory en) {
        this.en = en;
    }

    protected EntityManager getEntityManager() {
        EntityManager entityManager = en.createEntityManager();
        entityManager.joinTransaction();
        return entityManager;
    }
}
