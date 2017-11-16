package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.CarrierDao;
import com.itechart.javalab.data.entity.Carrier;
import com.oracle.deploy.update.UpdateInfo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Ilya Pavlovsky on 11/16/2017
 */
public class CarrierDaoImpl extends BaseDao implements CarrierDao {

    @Autowired
    public CarrierDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public List<Carrier> findAll() {
        final String FIND_ALL = "select c from Carrier";
        Query query = getEntityManager().createQuery(FIND_ALL);

        return query.getResultList();
    }

    @Override
    public Carrier findByName(String name) {
        final String FIND_BY_NAME = "select c from Carrier c where c.name=:name";
        Query query = getEntityManager().createQuery(FIND_BY_NAME).setParameter("name", name);
        return (Carrier) query.getSingleResult();
    }

    @Override
    public void save(Carrier entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public Carrier findById(long id) {
        return getEntityManager().find(Carrier.class, id);
    }

    @Override
    public void update(Carrier entity) {
        EntityManager entityManager = getEntityManager();

        Carrier carrier = entityManager.find(Carrier.class, entity.getId());
        carrier.setName(entity.getName());
        carrier.setType(entity.getType());
        carrier.setDescription(entity.getDescription());
        carrier.setUpdateInfo(entity.getUpdateInfo());
    }

    @Override
    public void delete(long id) {
        EntityManager entityManager = getEntityManager();

        Carrier carrier = entityManager.find(Carrier.class, id);
        if (carrier != null) {
            getEntityManager().remove(carrier);
        }
    }
}
