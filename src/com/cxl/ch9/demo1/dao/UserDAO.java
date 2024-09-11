package com.cxl.ch9.demo1.dao;

import com.cxl.ch9.demo1.pojo.User;

public interface UserDAO  {
	//根据账号和密码获取特定用户信息
	public User getUser(String loginId , String pwd );
}
