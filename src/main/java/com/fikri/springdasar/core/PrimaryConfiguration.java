package com.fikri.springdasar.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class PrimaryConfiguration {





    @Bean
    @Primary
    public Foo foo7(){
        var foo =  new Foo();
        log.info("create new foo 7");
        return foo;
    }

    @Bean
    public Foo foo8(){
        var foo =  new Foo();
        log.info("create new foo 8");
        return foo;
    }
}
