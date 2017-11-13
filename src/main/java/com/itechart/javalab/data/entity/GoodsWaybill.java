package com.itechart.javalab.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsWaybill {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waybill_id")
    private Waybill waybill;
    @Column
    private Integer count;
}
