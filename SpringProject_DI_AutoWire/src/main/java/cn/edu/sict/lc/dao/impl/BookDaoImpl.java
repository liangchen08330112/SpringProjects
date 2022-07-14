package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is saving...");
    }
}
