package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        ApplicationContext classPathXmlContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //从文件系统下加载配置文件
//        ApplicationContext fileSystemContext = new FileSystemXmlApplicationContext("D:\\SpringProjects\\SpringProject_Container\\src\\main\\resources\\ApplicationContext.xml");
        BookDao bookDao = (BookDao) classPathXmlContext.getBean("bookDao");
        bookDao.save();
        //不想强制类型转换应该这么写：
//        BookDao bookDao1 = classPathXmlContext.getBean("bookDao",BookDao.class);
//        bookDao1.save();
//        BookDao bookDao2 = classPathXmlContext.getBean(BookDao.class);
//        bookDao2.save();
    }
}
