package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Goods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yauhen Malchanau on 13.11.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class GoodsDaoImplTest {

    @Autowired
    private GoodsDao goodsDaoImpl;

    @Test
    public void shouldSaveGoods() {
        Goods goods = new Goods();
        goods.setName("крупа1");
        goods.setStatus("success");
        goodsDaoImpl.save(goods);
    }

    @Test
    public void shouldFindGoodsById() {
        Assert.assertEquals("goods", goodsDaoImpl.findById(1).getName());
    }

    @Test
    public void shouldFindGoodsByName() {
        Assert.assertEquals("goods", goodsDaoImpl.findByName("goods").getName());
    }
}
