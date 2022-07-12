package cn.edu.sict.lc.app;

import cn.edu.sict.lc.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        //通过静态工厂创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
