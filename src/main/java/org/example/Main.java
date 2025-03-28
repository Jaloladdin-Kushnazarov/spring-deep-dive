package org.example;


import org.example.configuration.AplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AplicationConfiguration.class);
        Performance performance = context.getBean(Performance.class);
        performance.perform();

    }
}