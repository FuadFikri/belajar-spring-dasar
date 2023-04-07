package com.fikri.springdasar;


import com.fikri.springdasar.core.BeanConfiguration;
import com.fikri.springdasar.core.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BeanTest {


    @Test
    void getBeanTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Assertions.assertEquals(foo1, foo2); //membuktikan bahwa bean bersifat singleton


    }
}
