package org.example.configuration;

import org.example.MyBean;
import org.example.MyBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration2 {

    @Bean
    public MyBean2 getMyBean2(MyBean myBean) {
        return new MyBean2(myBean);
    }
}
