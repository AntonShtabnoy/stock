package com.itechart.javalab.dao;

import com.itechart.javalab.data.entity.Address;
import com.itechart.javalab.data.entity.FullName;
import com.itechart.javalab.data.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
    Created by Bogdan Shishkin bogdanshishkin1998@gmail.com in warehouse
    Date/time: 14.11.2017 1:54
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoImplTest {

    @Autowired
    private UserDao userDaoImpl;

    @Test
    public void shouldSaveClient() throws ParseException {
        User user = new User();
        FullName name = new FullName();
        user.setFullName(name);
        user.getFullName().setFirstName("Vasiliy");
        user.getFullName().setLastName("Denisovich");

        Address address = new Address();
        address.setCountry("Belarus");
        address.setCity("Minsk");
        address.setStreet("Karbisheva");
        user.setAddress(address);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        user.setBirthday(format.parse("01.08.1967"));

        userDaoImpl.save(user);
    }
}