package com.itechart.javalab.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Entity
@Table(name = "write_off_goods")
@Data
@NoArgsConstructor
public class WriteOffGoods {

    @EmbeddedId
    private WriteOffGoodsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", insertable = false, updatable = false)
    private Goods goods;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "write_off_id", insertable = false, updatable = false)
    private WriteOff writeOff;

    @Column
    private Integer count;

    @Column
    private String info;
}
