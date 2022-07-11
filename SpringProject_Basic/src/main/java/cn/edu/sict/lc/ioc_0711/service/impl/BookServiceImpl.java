package cn.edu.sict.lc.ioc_0711.service.impl;

import cn.edu.sict.lc.ioc_0711.dao.BookDao;
import cn.edu.sict.lc.ioc_0711.dao.impl.BookDaoImpl;
import cn.edu.sict.lc.ioc_0711.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao dao = new BookDaoImpl();
    public void save() {
        System.out.println("BookService is saving...");
        dao.save();
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
