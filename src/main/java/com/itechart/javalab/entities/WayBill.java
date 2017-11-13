package com.itechart.javalab.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.sql.Timestamp;


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
    private Sender_Recipient partnerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Carrier carrierId;

    @Column
    private Timestamp registrationDatetime;

    @Column
    private Timestamp issueDate;

    @Column
    private Timestamp checkDate;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private User dispatcherId;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private User managerId;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
//    private User controllerId;

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
}
