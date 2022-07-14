package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("BookDao is saving..."+databaseName+","+connectionNum);
    }
}
