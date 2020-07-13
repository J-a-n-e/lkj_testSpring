package com.lkj.annotation04.dao;

import org.springframework.stereotype.Repository;
@Repository(value = "deptDao")
public class DeptDao implements IDao{

    public void select(){
        System.out.println("UserDao select()....");
    }

}
