package org.example.configuration;

import org.example.MyBean;
import org.example.MyBean2;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration1 {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public MyBean getMyBean() {
        return new MyBean();
    }

}
