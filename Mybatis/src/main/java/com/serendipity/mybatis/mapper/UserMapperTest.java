package com.serendipity.mybatis.mapper;

import com.serendipity.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.fail;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	/**
	 * @Before注解的方法会在@Test注解的方法之前执行
	 * 
	 * @throws Exception
	 */
	@Before
	public void init() throws Exception {
		//指定全局配置文件路径
		String resource = "SqlMapConfig.xml";
		//加载资源文件（全局配置文件和映射文件）
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//还有构建者模式，去创建SqlSessionFactory对象
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream );
	}
	
	//和Spring整合之后，需要再IoC容器中去管理两个对象：
	//SqlSessionFactory对象/MapperFactoryBean/MapperScannerConfigurer
	@Test
	public void testFindUserById() throws Exception {
		//构造UserMapper对象（sqlSession）
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//需要传的参数就是被代理的Mapper接口
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		//调用UserMapper对象的findUserById
		//User user = userMapper.findUserById(1);
		userMapper.findUserById(1);
		//User user =  userMapper.findUser("张三","浙江");
		userMapper.findUserTwo("李四","上海");
		userMapper.findUserByName("王五");
		//System.out.println(user);
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	public static void main(String[] args) {

	}
}
