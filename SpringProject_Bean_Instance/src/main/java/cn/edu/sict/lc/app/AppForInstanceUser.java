package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
//        UserDao userDao1 = (UserDao) context.getBean("userDao");
//        System.out.println(userDao);
//        System.out.println(userDao1);
        userDao.save();
    }
}
