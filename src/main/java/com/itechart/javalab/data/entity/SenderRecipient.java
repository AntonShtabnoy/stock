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
public class SenderRecipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "sender_recipient", fetch = FetchType.LAZY)
    private Set<WayBill> wayBills = new HashSet<>();

//    @Embedded
//    private UpdateInfo updateInfo;
}
