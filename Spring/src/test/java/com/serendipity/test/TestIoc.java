package com.serendipity.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.serendipity.springIoc.HelloIoc;

public class TestIoc {
    private ApplicationContext context;

    @Test
    public void testCreateObjectByConstrutor() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
         HelloIoc IOC = (HelloIoc) context.getBean("HelloIoc");
       
        IOC.sayHello();
        
        

    }
}
