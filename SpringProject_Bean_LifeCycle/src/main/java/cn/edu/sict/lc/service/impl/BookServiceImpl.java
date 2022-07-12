package cn.edu.sict.lc.service.impl;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("BookService is saving...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("BookDao is setting...");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Service Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service Init");
    }
}
