package com.xingtaizhiye.spring5.testdemo;

import com.xingtaizhiye.spring5.Book;
import com.xingtaizhiye.spring5.Orders;
import com.xingtaizhiye.spring5.User;
import com.xingtaizhiye.spring5.bean.Emp;
import com.xingtaizhiye.spring5.bean.Student;
import com.xingtaizhiye.spring5.service.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TestSpring5 {
    @Test
    public void testAdd(){
        //1、加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Student userService = context.getBean("student", Student.class);
        System.out.println(userService);

        List<String> hobbys = userService.getHobbys();
        Map<String,String> cards = userService.getCard();

        Set<String> games = userService.getGames();

        Properties info = userService.getInfo();
        for(Map.Entry<String,String> entry:cards.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        for(String s :games){
            System.out.println(s);
        }

        for (String key : info.stringPropertyNames()) {
            System.out.println(key + "=" + info.getProperty(key));
        }

        Student student = context.getBean("mybean",Student.class);
        System.out.println(student.getName());

        ApplicationContext context2 =
                new ClassPathXmlApplicationContext("bean2.xml");

        Emp emp = context2.getBean("emp",Emp.class);

    }
}
