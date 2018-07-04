package com.zc.springboottest.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zc.springboottest.mapper.UserMapper;
import com.zc.springboottest.model.UserInfo;

@Service
@CacheConfig(cacheNames="userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	Logger logger = LogManager.getLogger(getClass());

	@Override
	@Cacheable
	public List<UserInfo> findAll() {
		logger.info("we use database,not redis");
		return userMapper.findAll();
	}

	@Override
	public UserInfo findOne(int id) {
		return userMapper.findOne(id);
	}

}
