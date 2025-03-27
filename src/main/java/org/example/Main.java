package org.example;


import org.example.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-config.xml");
        Person person1 = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        Person person3 = context.getBean("person", Person.class);

        person1.setAge(20);
        person1.setFullName("John Doe");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}