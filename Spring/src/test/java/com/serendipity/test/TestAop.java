package com.serendipity.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.serendipity.springAop.TestService;

public class TestAop {
    private ApplicationContext context;

    @Test
    public void test() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestService service = context.getBean("service", TestService.class);

        System.out.println(service.getClass().getName());

        service.test("test execution");



    }
}
