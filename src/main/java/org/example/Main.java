package org.example;


import org.example.configuration.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean2 bean = context.getBean(MyBean2.class);
        bean.hi();

    }
}