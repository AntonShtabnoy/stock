package com.itechart.javalab.dao.impl;

import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.WaybillDao;
import com.itechart.javalab.data.entity.Waybill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Ilya Pavlovsky on 11/16/2017
 */
@Transactional
@Repository
public class WaybillDaoImpl extends BaseDao implements WaybillDao {

    @Autowired
    public WaybillDaoImpl(EntityManagerFactory en) {
        super(en);
    }

    @Override
    public List<Waybill> findWaybillsIn() {
        final String FIND_WATBILL_IN = "select w from waybill w where w.type=:type";
        Query query = getEntityManager().createQuery(FIND_WATBILL_IN).setParameter("type", "In");

        return query.getResultList();
    }

    @Override
    public List<Waybill> findWaybillsOut() {
        final String FIND_WATBILL_IN = "select w from waybill w where w.type=:type";
        Query query = getEntityManager().createQuery(FIND_WATBILL_IN).setParameter("type", "Out");

        return query.getResultList();
    }

    @Override
    public Integer getWaibillInCount() {
        final String FIND_WATBILL_IN = "select count(*) from waybill w where w.type=:type";
        Query query = getEntityManager().createQuery(FIND_WATBILL_IN).setParameter("type", "In");

        return (Integer) query.getSingleResult();
    }

    @Override
    public Integer getWaibillOutCount() {
        final String FIND_WATBILL_IN = "select count(*) from waybill w where w.type=:type";
        Query query = getEntityManager().createQuery(FIND_WATBILL_IN).setParameter("type", "Out");

        return (Integer) query.getSingleResult();
    }

    @Override
    public void save(Waybill entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public Waybill findById(long id) {
        return getEntityManager().find(Waybill.class, id);
    }

    @Override
    public void update(Waybill entity) {

    }

    @Override
    public void delete(long id) {
        EntityManager entityManager = getEntityManager();

        Waybill waybill = entityManager.find(Waybill.class, id);
        if (waybill != null) {
            getEntityManager().remove(waybill);
        }
    }
}
