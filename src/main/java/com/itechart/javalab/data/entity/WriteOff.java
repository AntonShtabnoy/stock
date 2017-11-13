package com.itechart.javalab.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WriteOff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
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
}
