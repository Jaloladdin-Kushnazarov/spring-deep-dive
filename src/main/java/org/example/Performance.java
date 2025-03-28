package org.example;

import java.util.Random;

public class Performance {


    public void perform() {
        if(new Random().nextBoolean()) {
        System.out.println("Performing Performance!!!!!!");
        }else {
            throw new RuntimeException("Performing bad!");
        }
    }
}
