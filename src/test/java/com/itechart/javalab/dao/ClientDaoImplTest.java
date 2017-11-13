package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:45
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientDaoImplTest {

    @Autowired
    private ClientDao clientDaoImpl;

    @Test
    public void shouldSaveClient(){
        Client client = new Client();
        client.setName("OOO \"Vasiliy Denisovich\"");
        client.setStatus("disabled");
        client.setStartDate(new Date(new java.util.Date().getTime()));
        clientDaoImpl.save(client);
    }
}
