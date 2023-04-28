package com.fikri.springdasar.core.data;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {


    @Bean
    public Foo foo(Bar bar){
        return new Foo();
    }

    @Bean
    public Bar bar(Foo foo){
        return new Bar();
    }

}
