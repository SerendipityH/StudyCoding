package com.serendipity.springIoc;
import com.serendipity.entity.User;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/11 13:58
 */
public class HelloIOC {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
        /*ClassPathResource resource = new ClassPathResource("spring-ioc.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        User user = (User)factory.getBean("user");
        System.out.println(user);*/
    }

}
