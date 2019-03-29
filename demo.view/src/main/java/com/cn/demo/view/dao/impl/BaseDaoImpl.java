package com.cn.demo.view.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.cn.demo.view.dao.BaseDao;
@Component
public class BaseDaoImpl<T, K> implements BaseDao<T, java.lang.String> {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		
		Type type = getClass().getGenericSuperclass();
		
		ParameterizedType pt = (ParameterizedType) type;
//		
		Type[] actualTypeArr = pt.getActualTypeArguments();
//		
		this.clazz = (Class<T>) actualTypeArr[0];
//		
		
//		ParameterizedType type  = (ParameterizedType) this.getClass().getGenericInterfaces()[0];
//		
//		Type[] actualTypeArr = type.getActualTypeArguments();
//		
//		this.clazz = (Class<T>) actualTypeArr[0];
	}
	
//	@Override
//	public T get(String key){
//		T t = (T) jdbcTemplate.queryForList("select * from base_user where id = 'AAA'");
//		T t = (T) jdbcTemplate.queryForObject("select * from base_user where id = 'AAA'", "");
//		List<T> userList = jdbcTemplate.queryForList("", EntityRowMapper);
//		List<T> userList = jdbcTemplate.query("select * from base_user where id = 'AAA'", new Object[]{}, new BeanPropertyRowMapper<>(clazz.class));
//        if(null!=userList&&userList.size()>0){
//            T t = userList.get(0);
//        }
		/*Statement createStatement = dataSource.getConnection().createStatement();
		ResultSet rs = createStatement.executeQuery("select * from base_user where id = 'AAA' ");
		while(rs.next()){
			int id = rs.getInt(1);// 获取第一个列的值 编号id
			String bookName = rs.getString(2);// 获取第二个列的值 图书名称 bookName
			String author = rs.getString(3);// 获取第三列的值 图书作者 author
			float price = rs.getFloat(4);// 获取第四列的值 图书价格 price
			System.out.println("id="+id+" bookName="+bookName
					            +" author="+author+" price="+price);
			System.out.println("................................................");
		}*/
//		return null;
//	}

	@Override
	public boolean saveOrUpdate(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(String key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
