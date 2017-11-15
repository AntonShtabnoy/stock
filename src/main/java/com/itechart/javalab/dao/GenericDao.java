package com.itechart.javalab.dao;


/**
 * Created by Yauhen Malchanau on 10.11.2017.
 */
public interface GenericDao<T> {

    void save(T entity);

    T findById(long id);

    void update(T entity);

    void delete(long id);
}
