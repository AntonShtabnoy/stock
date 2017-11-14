package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.RoleDao;
import com.itechart.javalab.data.entity.Role;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:42
*/
@Repository
@Transactional
public class RoleDaoImpl extends BaseDao implements RoleDao {

    public RoleDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void save(Role entity) {
        currentSession().save(entity);
    }
}
