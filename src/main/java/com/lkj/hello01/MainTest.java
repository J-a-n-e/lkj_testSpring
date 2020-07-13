package com.lkj.hello01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        //1.创建HelloWorld对象
        HelloWorld helloWorld = new HelloWorld();
        //2.赋值
        helloWorld.setUsername1("张三");
        //3.使用对象的方法
        helloWorld.work();

        System.out.println();
        System.out.println("-------------Spring IOC------------");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld h = ac.getBean(HelloWorld.class);
        h.work();
    }

}
