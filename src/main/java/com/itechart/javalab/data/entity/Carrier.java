package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carrier")
@Data
@NoArgsConstructor
public class Carrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<Waybill> waybills = new HashSet<>();

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<Driver> drivers = new HashSet<>();

    @OneToMany(mappedBy = "carrier", fetch = FetchType.LAZY)
    private Set<WriteOff> writeOffs = new HashSet<>();

//    @Embedded
//    private UpdateInfo updateInfo;
}
