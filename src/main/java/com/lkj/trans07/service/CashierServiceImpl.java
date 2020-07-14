package com.lkj.trans07.service;

import java.util.List;

import javax.annotation.Resource;
import com.lkj.trans07.exception.AccountException;
import com.lkj.trans07.exception.BookStockException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("cashierService")
public class CashierServiceImpl implements ICashierService {
    @Resource
    private IBookShopService bookShopService;

    //客户的结账
    @Transactional
    @Override
    public void cash(String username, List<Integer> bookIds) /*throws AccountException, BookStockException */{
        for (Integer bookId : bookIds) {
            bookShopService.purchase(username, bookId);
        }
    }

}