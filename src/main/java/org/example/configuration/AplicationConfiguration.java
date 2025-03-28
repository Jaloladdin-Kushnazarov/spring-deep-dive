package org.example.configuration;

import org.example.Audience;
import org.example.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AplicationConfiguration {

    @Bean
    public Performance performance() {
        return new Performance();
    }


    @Bean
    public Audience audience() {
        return new Audience();
    }


}
