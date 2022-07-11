package cn.edu.sict.lc.di_0711.app;

import cn.edu.sict.lc.ioc_0711.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService service = (BookService) context.getBean("bookService");
        service.save();
    }
}
