package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:23
*/
@Entity
@Table
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

}
