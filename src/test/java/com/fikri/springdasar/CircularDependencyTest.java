package com.fikri.springdasar;

import com.fikri.springdasar.core.DependsOnConfiguration;
import com.fikri.springdasar.core.data.CyclicConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyTest {


    @Test
    void circularDependencyTest() {

        try{
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
            Assertions.fail();
        }catch (BeansException e){
            e.printStackTrace();
        }
    }

    @Test
    void dependsOnTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
}
