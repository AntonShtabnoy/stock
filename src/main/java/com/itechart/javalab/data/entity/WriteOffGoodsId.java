package com.itechart.javalab.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Yauhen Malchanau on 14.11.2017.
 */
@Embeddable
@Data
@NoArgsConstructor
class WriteOffGoodsId implements Serializable {

    private static final long serialVersionUID = 143243232L;

    @Column(name = "goods_id")
    private Long goodsId;

    @Column(name = "write_off_id")
    private Long writeOffId;
}
