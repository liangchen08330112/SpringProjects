package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

public class BookDaoImpl implements BookDao {

    //Spring创建bean时调用无参的构造方法。
    public BookDaoImpl() {
        System.out.println("The constructor of BookDao is running...");
    }

    @Override
    public void save() {
        System.out.println("BookDao is saving...");
    }
}
