package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("构造方法");
    }

    @Override
    public void save() {
        System.out.println("BookDao is saving...");
    }
}
