package com.cxl.ch9.demo1.pojo;

import com.cxl.ch9.demo1.Counter;

public class User {
	private int uid;
	private String loginId;
	private String pwd;
	private String nickName;

	public String getLoginId() {
		return loginId;
	}

	public String getPwd() {
		return pwd;
	}
	private static User instance = null;

	private User() {
	}

	public static User getInstance() {
		synchronized (Counter.class){
			if(instance==null){
				instance = new User();
			}
		}
		return instance;
	}

}
