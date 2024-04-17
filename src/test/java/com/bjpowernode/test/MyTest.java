package com.bjpowernode.test;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//Sprig整合junit
@ContextConfiguration(locations = {"classpath:applicationContext_service.xml","classpath:applicationContext_dao.xml"})
public class MyTest {
    @Autowired
    UserService service;
    @Test
    public void testSeletctAll() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
//
//        UserService service = ac.getBean(UserService.class);

        List<User> list = service.selectUserPage("","",0);
        list.forEach(user -> System.out.println(user));
        System.out.println("aa");
    }
}
