package org.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyBean2 {
    private final MyBean myBean;

    public void hi() {
        myBean.hi();
        System.out.println("Hi it's MyBean2!");
    }
}
