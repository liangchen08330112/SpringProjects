package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        //注册关闭钩子
//        context.registerShutdownHook();
        context.close();
        /**
         * close()方法较为暴力。因此如果不将close()方法置于main方法末尾，
         * 则会出现容器创建好后立马被关闭，下面的方法都无法执行，即抛出工厂未初始化或已关闭的异常。
         * 但初始化和销毁bean的方法仍然正常运行。
         */
    }
}
