package com.lkj.trans07.test;

import com.lkj.trans07.dao.IBookShopDao;
import com.lkj.trans07.exception.AccountException;
import com.lkj.trans07.exception.BookStockException;
import com.lkj.trans07.service.IBookShopService;
import com.lkj.trans07.service.ICashierService;
import java.util.Arrays;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringTrans {

    private ApplicationContext ac;
    private IBookShopDao bookShopDao;
    private IBookShopService bookShopService;
    private ICashierService cashierService;

    {
        ac = new ClassPathXmlApplicationContext("beans_trans.xml");
        bookShopDao = (IBookShopDao)ac.getBean("bookShopDao");
        bookShopService = (IBookShopService)ac.getBean("bookShopService");
        cashierService = (ICashierService)ac.getBean("cashierService");
    }
//查看书id为1的书价格，方便后面购买
    @Test
    public void testSelectPrice() {
        int price = bookShopDao.selectPrice(1);
        System.out.println(price);
    }
//查看id为1的书是否还有库存
    @Test
    public void testUpdateStock() throws BookStockException {
        bookShopDao.updateStock(1);
    }
//更新账户余额，在这因为余额不足会抛出自定义异常
    @Test
    public void testUpdateBalance() throws AccountException {
        bookShopDao.updateBalance("张三", 40);
    }

    @Test
    public void testPurchase() /*throws AccountException, BookStockException*/ {
        //service层添加的注解式事务管理，购买未成功会事务回滚。
        //未添加事务管理：可能会出现一个情况,当余额不足时购买书,将购买失败，余额没变,但库存依旧减少
        bookShopService.purchase("张三", 1);
    }

    @Test
    public void testCash() /*throws AccountException, BookStockException*/ {
        //未正确添加事务管理：可能会出现一种情况,当余额不足购买所有书时,会事务回滚,一本书都买不成功
        cashierService.cash("张三", Arrays.asList(1,2));
    }

}