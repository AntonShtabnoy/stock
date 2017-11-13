package com.itechart.javalab.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
public class BaseDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
