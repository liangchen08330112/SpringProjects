package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("ApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);
//        BookDao bookDao = factory.getBean(BookDao.class);
//        bookDao.save();
    }
}
