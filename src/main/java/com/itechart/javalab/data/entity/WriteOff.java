package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Entity
@Table(name = "write_off")
@Data
@NoArgsConstructor
public class WriteOff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column
    private String reason;

    @Column
    private String action;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "controller_id")
    private User controller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsible_user_id")
    private User responsibleUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsible_carrier_id")
    private Carrier responsibleCarrier;

    @OneToMany(mappedBy = "goods", fetch = FetchType.LAZY)
    private Set<WriteOffGoods> writeOffGoodsCountsAndInfo = new HashSet<>();

    @Embedded
    private UpdateInfo updateInfo;
}
