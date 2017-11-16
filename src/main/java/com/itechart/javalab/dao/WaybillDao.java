package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Waybill;

import java.util.List;

/**
 * Created by Pavlovsky Ilya on 11/16/2017
 */
public interface WaybillDao extends GenericDao<Waybill> {

    List<Waybill> findWaybillsIn();

    List<Waybill> findWaybillsOut();

    Integer getWaibillInCount();

    Integer getWaibillOutCount();
}
