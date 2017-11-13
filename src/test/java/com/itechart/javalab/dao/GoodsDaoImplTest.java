package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Goods;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
public class GoodsDaoImplTest {

    @Autowired
    GoodsDao goodsDao;

    @Test
    public void shouldSaveGoods() {
        Goods goods = new Goods();
        goods.setName("goods");
        goods.setStatus("Ok");
        goodsDao.save(goods);
    }
}
