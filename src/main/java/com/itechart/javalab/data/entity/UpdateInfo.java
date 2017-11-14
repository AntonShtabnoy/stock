package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Embeddable
@Data
@NoArgsConstructor
class UpdateInfo {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by")
    private User updatedBy;

    @Column(name = "update_time")
    private Timestamp updateTime;
}
