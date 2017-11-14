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
    @JoinColumn(name = "partner_id")
    private SenderRecipient partner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrier_id")
    private Carrier carrier;

    @Column(name = "registration_datetime", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp registrationDatetime;

    @Column(name = "issue_date")
    private Timestamp issueDate;

    @Column(name = "check_date")
    private Timestamp checkDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dispatcher_id")
    private User dispatcher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private User manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "controller_id")
    private User controller;

    @Column(name = "status")
    private String status;

    @Column(name = "number")
    private String number;

    @Column(name = "description")
    private String description;

    @Column(name = "sum")
    private Integer sum;

    @Column(name = "name_count")
    private Integer nameCount;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "waybill", fetch = FetchType.LAZY)
    private Set<GoodsWaybill> waybillGoodsCounts = new HashSet<>();

//    @Embedded
//    private UpdateInfo updateInfo;
}
