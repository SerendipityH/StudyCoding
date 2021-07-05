package com.serendipity.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    private ApplicationContext context;

    @Test
    public void test() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

         com.serendipity.springIoc.HelloIoC IOC = (com.serendipity.springIoc.HelloIoC) context.getBean("HelloIoc");

        IOC.sayHello();



    }
}
