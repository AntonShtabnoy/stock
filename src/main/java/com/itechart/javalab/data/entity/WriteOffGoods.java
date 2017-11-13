package com.itechart.javalab.data.entity;

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
public class WriteOffGoods {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id")
    private Goods goods;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "write_off_id")
    private WriteOff writeOff;
    @Column
    private Integer count;
    @Column
    private String info;
}
