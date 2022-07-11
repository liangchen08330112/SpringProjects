package cn.edu.sict.lc.di_0711.dao.impl;

import cn.edu.sict.lc.ioc_0711.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookService is saving...");
    }
}
