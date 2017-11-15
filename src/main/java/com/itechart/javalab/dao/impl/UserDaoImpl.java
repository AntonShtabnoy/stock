package com.itechart.javalab.dao.impl;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:19
*/

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.UserDao;
import com.itechart.javalab.data.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

@Repository
@Transactional
public class UserDaoImpl extends BaseDao implements UserDao {

    public UserDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public void save(User entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(long id) {

    }
}
