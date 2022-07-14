package cn.edu.sict.lc.dao.impl;

import cn.edu.sict.lc.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("BookDao is saving...");
        System.out.println("遍历数组："+ Arrays.toString(array));
        System.out.println("遍历List："+stringList);
        System.out.println("遍历Set："+stringSet);
        System.out.println("遍历Map："+map);
        System.out.println("遍历Properties："+properties);
    }
}
