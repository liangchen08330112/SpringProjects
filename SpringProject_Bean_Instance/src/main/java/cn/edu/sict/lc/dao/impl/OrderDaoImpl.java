package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao is saving...");
    }
}
