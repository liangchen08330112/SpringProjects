package cn.edu.sict.lc.factory;

import cn.edu.sict.lc.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDaoImpl getOrderDao(){
        System.out.println("Factory setup...");
        return new OrderDaoImpl();
    }
}
