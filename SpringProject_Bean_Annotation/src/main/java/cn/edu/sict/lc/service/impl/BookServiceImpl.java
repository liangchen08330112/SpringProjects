package cn.edu.sict.lc.service.impl;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("BookService is saving...");
        bookDao.save();
    }
}
