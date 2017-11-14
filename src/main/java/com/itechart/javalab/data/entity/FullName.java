package com.itechart.javalab.data.entity;

import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by Anton Shtabnoy on 11/14/2017.
 */
@Embeddable
@Data
@NoArgsConstructor
public class FullName {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;
}
