package org.example;


import org.example.config.MyConfig;
import org.example.servise.HomeController;
import org.example.servise.UserServise1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean2 myBean2 = container.getBean(MyBean2.class);
        myBean2.hi();

        HomeController homeController = container.getBean(HomeController.class);


    }
}