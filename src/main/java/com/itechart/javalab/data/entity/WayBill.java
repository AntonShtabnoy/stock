package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by Ilya Pavlovsky 13.11.2017
 */
@Entity
@Table
@Data
@NoArgsConstructor
public class WayBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private SenderRecipient partner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Carrier carrier;

    @Column
    private Timestamp registrationDatetime;

    @Column
    private Timestamp issueDate;

    @Column
    private Timestamp checkDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User dispatcher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User controller;

    @Column
    private String status;

    @Column
    private String number;

    @Column
    private String description;

    @Column
    private Integer sum;

    @Column
    private Integer nameCount;

    @Column
    private String type;

    @OneToMany(mappedBy = "waybill", fetch = FetchType.LAZY)
    private Set<GoodsWaybill> waybillGoodsCounts = new HashSet<>();
}
