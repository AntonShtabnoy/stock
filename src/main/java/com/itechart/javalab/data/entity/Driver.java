package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private FullName fullName;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "passport_issue")
    private String passportIssue;

    @Column(name = "country_code")
    private String countryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrier_id", nullable = false)
    private Carrier carrier;

    @Embedded
    private UpdateInfo updateInfo;

}
