package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is saving...");
    }
    //表示初始化bean对应的操作
    public void init(){
        System.out.println("Bean Init");
    }
    //表示bean销毁对应的操作
    public void destroy(){
        System.out.println("Bean Destroy");
    }
}
