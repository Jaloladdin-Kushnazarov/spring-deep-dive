package org.example;


import org.example.configuration.MainAplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAplicationConfiguration.class);
        MyBean2 bean = context.getBean(MyBean2.class);
        bean.hi();

        context.close();

    }
}