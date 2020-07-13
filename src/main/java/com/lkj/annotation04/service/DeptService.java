package com.lkj.annotation04.service;

import com.lkj.annotation04.dao.IDao;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service标注当前类是一个业务逻辑类，添加至IOC容器中
@Service
public class DeptService {
    //@Autowired
    @Resource(name="deptDao")
    private IDao dao;

    public void selectOne(){
        dao.select();
        System.out.println("DeptService selectOne()");
    }
}
