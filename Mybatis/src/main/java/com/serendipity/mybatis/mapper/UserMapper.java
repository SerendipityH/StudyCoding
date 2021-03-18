package com.serendipity.mybatis.mapper;

import com.serendipity.mybatis.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	public User findUserById(@Param("id") int id) throws Exception;

	public User findUserByName( @Param("username") String username) throws Exception;

	public User findUser( String username,String address) throws Exception;

	public User findUserTwo(@Param("username") String username,@Param("address") String address) throws Exception;
	//public void insertUser(User user) throws Exception;
}