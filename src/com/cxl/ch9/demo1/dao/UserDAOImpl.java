package com.cxl.ch9.demo1.dao;

import com.cxl.ch9.demo1.pojo.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {

	public User getUser(String loginId, String pwd) {
		//编写模拟数据库中查询
String hql = "select from User where loginId = ? and pwd = ? " ;
			List<User> userList = null;
		return userList!=null && userList.size()>0 ? userList.get(0) : null ;	}

}
