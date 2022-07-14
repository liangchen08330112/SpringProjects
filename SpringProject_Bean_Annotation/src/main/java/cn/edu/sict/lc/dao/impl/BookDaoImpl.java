package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Component
@Repository("bookDao")
@Controller
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is saving...");
    }
}
