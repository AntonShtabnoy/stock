package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by Anton Shtabnoy on 11/14/2017.
 */
@Embeddable
@Data
@NoArgsConstructor
public class FullName {
    private String firstName;
    private String lastName;
    private String middleName;
}
