package com.itechart.javalab.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@Entity
@Table
@Data
@NoArgsConstructor
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "storage_method")
    private String storageMethod;

    @Column(name = "storage_duration")
    private Integer storageDuration;

    @Column
    private Integer cost;

    @Column
    private Double weight;

    @Column
    private String status;

    @Column(name = "placement_datetime")
    private Timestamp placementDatetime;

    @Column
    private Integer count;

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY)

    private Set<GoodsWaybill> waybillGoodsCounts = new HashSet<>();

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY)
    private Set<WriteOffGoods> writeOffGoodsCountsAndInfo = new HashSet<>();

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY)
    private Set<Cell> cells = new HashSet<>();

    @Embedded
    private UpdateInfo updateInfo;

}