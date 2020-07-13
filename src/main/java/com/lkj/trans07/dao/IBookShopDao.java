package com.lkj.trans07.dao;
import com.lkj.trans07.exception.AccountException;
import com.lkj.trans07.exception.BookStockException;

public interface IBookShopDao {

    //根据bookId获取书的价格
    public int selectPrice(int bookId);
    //根据bookId更新库存
    public void updateStock(int bookId) throws BookStockException, BookStockException;
    //根据username,price更新账户余额
    public void updateBalance(String username, int price) throws AccountException, AccountException;

}