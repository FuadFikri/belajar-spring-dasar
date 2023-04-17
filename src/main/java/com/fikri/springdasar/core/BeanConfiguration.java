package com.fikri.springdasar.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class BeanConfiguration {



    @Bean
    public Foo foo(){
        var foo =  new Foo();
        log.info("create new foo");
        return foo;

    }

    @Bean
    public Foo foo1(){
        var foo =  new Foo();
        log.info("create new foo 1");
        return foo;
    }

    @Bean
    public Foo foo2(){
        var foo =  new Foo();
        log.info("create new foo 2");
        return foo;
    }

    @Bean(value = "fooSeven")
    public Foo foo7(){
        var foo =  new Foo();
        log.info("create new foo 7");
        return foo;
    }

    @Bean(value = "fooEight")
    public Foo foo8(){
        var foo =  new Foo();
        log.info("create new foo 8");
        return foo;
    }
}
