package com.itechart.javalab.data.entity;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:21
*/

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String status;

    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Date finishDate;

}
