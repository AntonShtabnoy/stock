package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsDaoImplTest {

    @Autowired
    private GoodsDao goodsDaoImpl;

    @Test
    public void shouldSaveGoods() {
        Goods goods = new Goods();
        goods.setName("goods");
        goods.setStatus("Ok");
        goodsDaoImpl.save(goods);
    }
}
