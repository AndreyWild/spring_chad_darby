package com.wild.springannotations.config;

import com.wild.springannotations.interfaces.Coach;
import com.wild.springannotations.entities.SwimCoach;
import com.wild.springannotations.interfaces.FortuneService;
import com.wild.springannotations.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(value = "com.wild.springannotations")
@PropertySource(value = "classpath:sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
