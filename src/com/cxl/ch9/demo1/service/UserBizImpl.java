package com.cxl.ch9.demo1.service;

import com.cxl.ch9.demo1.dao.UserDAO;
import com.cxl.ch9.demo1.pojo.User;

public class UserBizImpl implements UserBiz {

	private UserDAO userDAO = null ;
	
	public User login(String loginId, String pwd) {
		return userDAO.getUser(loginId, pwd);
	}

}
