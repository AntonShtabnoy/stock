package com.itechart.javalab.dao.impl;

import com.itechart.javalab.annotations.SearchCriteria;
import com.itechart.javalab.dao.BaseDao;
import com.itechart.javalab.dao.GoodsDao;
import com.itechart.javalab.data.entity.Goods;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import static org.hibernate.criterion.DetachedCriteria.forClass;
import static org.hibernate.criterion.Restrictions.eq;

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
    public List<Goods> findByCriteria(Goods criteria) {
        DetachedCriteria hibernateCriteria = forClass(Goods.class);

        Session session = getEntityManager().getEntityManagerFactory().unwrap(Session.class);
        SessionFactory sessionFactory = session.getSessionFactory();

        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);

        for(Field field : criteria.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(SearchCriteria.class)){
                String fieldName = field.getName();
                Object fieldValue;

                try {
                    fieldValue = field.get(criteria);
                    if(fieldValue != null)
                    hibernateCriteria = hibernateCriteria.add(eq(fieldName, fieldValue));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException();
                }
            }
        }
        return (List<Goods>) hibernateTemplate.findByCriteria(hibernateCriteria);

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
