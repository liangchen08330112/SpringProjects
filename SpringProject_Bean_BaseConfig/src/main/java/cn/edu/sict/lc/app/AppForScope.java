package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao dao1 = (BookDao) context.getBean("bookDao");
        BookDao dao2 = (BookDao) context.getBean("bookDao");
        System.out.println(dao1);
        System.out.println(dao2);
    }
}
