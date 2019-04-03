package com.cn.demo.view.dao;

import java.io.Serializable;
import java.sql.SQLException;

public interface BaseDao<T, K extends Serializable> {

	T get(Class<T> clazz, K key) throws SQLException ;

	boolean saveOrUpdate(T t);

	boolean delete(T t);

//	T get(String key)throws SQLException ;

}
