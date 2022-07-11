package cn.edu.sict.lc.app;

import cn.edu.sict.lc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService service = (BookService) context.getBean("service");
        service.save();
    }
}
