package com.fikri.springdasar.core;


import com.fikri.springdasar.core.data.Bar;
import com.fikri.springdasar.core.data.Foo;
import com.fikri.springdasar.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfig {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean(value = "bar2")
    public Bar bar2(){
        return new Bar();
    }


    @Bean
    public FooBar fooBar(Foo foo, @Qualifier("bar2") Bar bar){
        return new FooBar(foo,bar);
    }


}
