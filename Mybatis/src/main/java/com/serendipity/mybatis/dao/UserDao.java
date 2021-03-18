package com.serendipity.mybatis.dao;

import com.serendipity.mybatis.po.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;
	public void insertUser(User user) throws Exception;
}
