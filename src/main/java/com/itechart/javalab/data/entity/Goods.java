package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Timestamp;

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
    @Column
    private String storageMethod;
    @Column
    private Integer storageDuration;
    @Column
    private Integer cost;
    @Column
    private Double weight;
    @Column
    private String status;
    @Column
    private Timestamp placementDatetime;
    @Column
    private Integer count;
}
