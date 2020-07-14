package com.lkj.trans07.service;

import com.lkj.trans07.exception.AccountException;
import com.lkj.trans07.exception.BookStockException;

public interface IBookShopService {

    //通过账户名及书号购买书
    public void purchase(String username, int bookId) throws BookStockException, AccountException;
}
