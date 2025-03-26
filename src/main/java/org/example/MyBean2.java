package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class MyBean2 {
    private final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }


    public void hi(){
        System.out.println("hi MyBean2!");
        myBean.hi();
    }
}
