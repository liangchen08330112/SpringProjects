package cn.edu.sict.lc.service.impl;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("BookService is saving...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
