package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao is saving...");
    }
}
