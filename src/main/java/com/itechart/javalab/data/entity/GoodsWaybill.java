package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Entity
@Table(name = "goods_waybill")
@Data
@NoArgsConstructor
public class GoodsWaybill {

    @EmbeddedId
    private GoodsWaybillId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", insertable = false, updatable = false)
    private Goods goods;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waybill_id", insertable = false, updatable = false)
    private Waybill waybill;

    @Column
    private Integer count;
}
