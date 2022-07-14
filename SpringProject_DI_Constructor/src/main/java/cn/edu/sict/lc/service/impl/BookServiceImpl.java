package cn.edu.sict.lc.service.impl;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.dao.UserDao;
import cn.edu.sict.lc.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("BookService is saving...");
        bookDao.save();
        userDao.save();
    }

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }
}
