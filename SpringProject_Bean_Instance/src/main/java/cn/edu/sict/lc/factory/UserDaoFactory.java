package cn.edu.sict.lc.factory;

import cn.edu.sict.lc.dao.UserDao;
import cn.edu.sict.lc.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
