package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class MyBean {

    public void hi(){
        System.out.println("Hello PDP!");
        System.out.println("Learn Spring Core here!");
    }


    @PostConstruct
    public void init(){
        System.out.println(getClass().getName() + " init method!!!!!!!!!!!!!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(getClass().getName() + " destroy method!!!!!!!!!!!");
    }
}
