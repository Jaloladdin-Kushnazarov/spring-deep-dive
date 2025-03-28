package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(* org.example.Performance.perform(..))")
    public void silencingPhones() {
        System.out.println("Silencing Cell Phones");
    }


    @Before("execution(* org.example.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Take seats");
    }

    @After("execution(* org.example.Performance.perform(..))")
    public void applausel(){
        System.out.println("\uD83D\uDC4F \uD83D\uDC4F\uD83D\uDC4F\uD83D\uDC4F\uD83D\uDC4F");
    }


    @AfterThrowing  ("execution(* org.example.Performance.perform(..))")
    void refund() {
        System.out.println("Refund.... ");
    }
}
