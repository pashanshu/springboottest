package com.zc.springboottest.service;

import java.util.List;

import com.zc.springboottest.model.UserInfo;

public interface UserService {

	/**
	 * findAll
	 * @return
	 */
	List<UserInfo> findAll();
	
	UserInfo findOne(int id);
}
