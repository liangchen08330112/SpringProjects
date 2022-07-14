package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.BookDao;
import cn.edu.sict.lc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookDao);
        System.out.println(bookService);
    }
}
