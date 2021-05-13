package com.zht.controller;
import com.zht.pojo.Bean;
import com.zht.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Bean beans = (Bean) context.getBean("hello");
        System.out.println(beans.toString());

        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }


}
