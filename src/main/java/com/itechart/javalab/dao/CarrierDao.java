package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Carrier;

import java.util.List;

/**
 * Created by Ilya Pavlovsky on 11/16/2017
 */
public interface CarrierDao extends GenericDao<Carrier> {

    List<Carrier> findAll();

    Carrier findByName(String name);
}
