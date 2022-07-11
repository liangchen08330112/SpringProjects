package cn.edu.sict.lc.service.impl;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao dao;
    @Override
    public void save() {
        System.out.println("BookDao is saving...");
        dao.save();
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
