package com.fikri.springdasar;


import com.fikri.springdasar.core.BeanConfiguration;
import com.fikri.springdasar.core.Foo;
import com.fikri.springdasar.core.PrimaryConfiguration;
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

    @Test
    void duplicateTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2",Foo.class);
        Assertions.assertNotSame(foo1,foo2);

    }


    @Test
    void primaryTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
        Foo foo = applicationContext.getBean(Foo.class); // get from primary
        Foo foo1 = applicationContext.getBean("foo7",Foo.class);

        Assertions.assertSame(foo,foo1);

    }
}
