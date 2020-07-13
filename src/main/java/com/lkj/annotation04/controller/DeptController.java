package com.lkj.annotation04.controller;

import com.lkj.annotation04.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller标注当前类是一个控制类，添加至IOC容器中
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;

    public void find(){
        deptService.selectOne();
        System.out.println("DeptController find()");
    }

}
