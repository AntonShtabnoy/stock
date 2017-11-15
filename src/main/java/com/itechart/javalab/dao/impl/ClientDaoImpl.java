package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.ClientDao;
import com.itechart.javalab.data.entity.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:42
*/
@Repository
@Transactional
public class ClientDaoImpl extends BaseDao implements ClientDao {


    public ClientDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public void save(Client entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public Client findById(long id) {
        return null;
    }

    @Override
    public void update(Client entity) {

    }

    @Override
    public void delete(long id) {

    }
}
