package com.fikri.springdasar.core;


import com.fikri.springdasar.core.data.Bar;
import com.fikri.springdasar.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn("bar")
    public Foo foo(){
        log.info("creating foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("creating bar");
        return new Bar();
    }
}
