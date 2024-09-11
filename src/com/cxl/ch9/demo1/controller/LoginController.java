package com.cxl.ch9.demo1.controller;

import com.cxl.ch9.demo1.pojo.User;
import com.cxl.ch9.demo1.service.UserBiz;

public class LoginController{
	
	private UserBiz userBiz;
	public String execute(User user) {
		User user1 = userBiz.login( user.getLoginId(),user.getPwd());
		
		if(user1!=null){
		
			return "success";
		}else{
			return "fail";
		}
	}

}
