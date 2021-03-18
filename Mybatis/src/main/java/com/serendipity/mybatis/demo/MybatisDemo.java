package com.serendipity.mybatis.demo;

import com.serendipity.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class MybatisDemo {
	
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
		
		//设计模式分三类23种：创建型（5）、结构型（7）、行为型（11）
	}
	
	@Test
	public void testSelect() {
		//由SqlSessionFactory工厂去创建SqlSession（会话）
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//调用sqlsession接口，去实现数据库的增删改查操作
		User user = sqlSession.selectOne("test.findUserById", 1);
		
		System.out.println(user);
		//释放资源
		sqlSession.close();
	}
}
