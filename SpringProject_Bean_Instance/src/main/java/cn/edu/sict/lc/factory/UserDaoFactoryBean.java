package cn.edu.sict.lc.factory;

import cn.edu.sict.lc.dao.UserDao;
import cn.edu.sict.lc.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中实例对象创建的方法。
    @Override
    public UserDao getObject() {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //是否为单例？true表示创建单例，false表示创建非单例。
//    @Override
//    public boolean isSingleton() {
//        return true;
//    }
}
