package com.rth.study.test;

import com.rth.study.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testbean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Book book = context.getBean("book", Book.class);
    }
}
