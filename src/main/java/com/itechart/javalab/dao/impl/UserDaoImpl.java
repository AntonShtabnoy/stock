package com.itechart.javalab.dao.impl;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:19
*/

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.UserDao;
import com.itechart.javalab.data.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl extends BaseDao implements UserDao {

    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void save(User entity) {
        currentSession().save(entity);
    }
}
