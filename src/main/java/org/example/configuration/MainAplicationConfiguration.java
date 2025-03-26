package org.example.configuration;

import org.example.DbInitCondition;
import org.example.DbInitData;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:aplication.properties")
@Import({MyConfiguration1.class, MyConfiguration2.class})
public class MainAplicationConfiguration {


    @Bean(initMethod = "initSameData")
    @Conditional(DbInitCondition.class)
    public DbInitData dbInitData() {
        return new DbInitData();
    }

}
