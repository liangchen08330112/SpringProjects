package cn.edu.sict.lc.di_0711.service.impl;

import cn.edu.sict.lc.ioc_0711.dao.BookDao;
import cn.edu.sict.lc.ioc_0711.service.BookService;

public class BookServiceImpl implements BookService {
    //这里需要降低耦合，所以不能新建对象。我们写Java代码一直都在追求高内聚低耦合。
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("BookDao is saving...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
