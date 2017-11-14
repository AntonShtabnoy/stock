package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
public class Carrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private String name;

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<WayBill> wayBills = new HashSet<>();

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<Driver> drivers = new HashSet<>();

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<WriteOff> writeOffs = new HashSet<>();
}
