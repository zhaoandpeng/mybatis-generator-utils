package com.cn.demo.view.service.impl;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.demo.view.dao.BaseDao;
import com.cn.demo.view.service.BaseService;
@Service
public class BaseServiceImpl<T, K> implements BaseService<T, java.lang.String>{

	
	@Resource(name="baseDaoImpl")
	private BaseDao baseDao;
	
	@Override
	public T get(String key) throws SQLException {
		
		return (T) baseDao.get(key);
	}

	@Override
	public boolean saveOrUpdate(T t) {
		
		return baseDao.saveOrUpdate(t);
	}

	@Override
	public boolean delete(T t) {
		
		return baseDao.delete(t);
	}

}
