package com.itechart.javalab.data.entity;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:18
*/

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Embedded
    private FullName fullName;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column
    private String login;

    @Column
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @Embedded
    private Address address;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_role",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") }
    )
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "dispatcher", fetch = FetchType.LAZY)
    private Set<Waybill> dispatcherWaybills = new HashSet<>();

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    private Set<Waybill> managerWaybills = new HashSet<>();

    @OneToMany(mappedBy = "controller", fetch = FetchType.LAZY)
    private Set<Waybill> controllerWaybills = new HashSet<>();

    @Embedded
    private UpdateInfo updateInfo;
}
