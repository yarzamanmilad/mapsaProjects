package org.mapsa.beanExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("classpath*:bean.xml");
        Message msg=(Message) applicationContext.getBean("message");
        msg.getMsg();
    }
}
