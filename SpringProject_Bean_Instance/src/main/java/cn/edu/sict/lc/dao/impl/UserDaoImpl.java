package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImpl implements UserDao{

    @Override
    public void save() {
        System.out.println("UserDao is saving");
    }
}
