package com.lkj.annotation04.test;

import com.lkj.annotation04.controller.DeptController;
import com.lkj.annotation04.entity.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        //1.创建IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans_ch04_annotation.xml");

        //2.注入实例，获得实例
        Dept dept = ac.getBean(Dept.class);
        System.out.println(dept);

        DeptController controller = ac.getBean(DeptController.class);
        controller.find();

    }

}
