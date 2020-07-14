package com.lkj.trans07.service;

import com.lkj.trans07.exception.AccountException;
import com.lkj.trans07.exception.BookStockException;

import java.util.List;

public interface ICashierService {

    //客户的结账
    public void cash(String username, List<Integer> bookIds) throws AccountException, BookStockException;
}