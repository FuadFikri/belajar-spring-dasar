package com.fikri.springdasar.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {



    @Bean
    public Foo foo(){
        var foo =  new Foo();
        log.info("create new foo");
        return foo;

    }
}
