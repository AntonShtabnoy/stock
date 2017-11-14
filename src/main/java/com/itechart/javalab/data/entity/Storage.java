package com.itechart.javalab.data.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column
    private String info;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "storage" , fetch = FetchType.LAZY)
    private Set<Cell> cells = new HashSet<>();

    @Embedded
    private UpdateInfo updateInfo;
}
