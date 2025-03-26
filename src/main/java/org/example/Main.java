package org.example;


import org.example.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean2 myBean2 = context.getBean(MyBean2.class);
        myBean2.hi();


    }
}