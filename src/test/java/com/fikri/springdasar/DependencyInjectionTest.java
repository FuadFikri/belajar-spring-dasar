package com.fikri.springdasar;

import com.fikri.springdasar.core.DependencyInjectionConfig;
import com.fikri.springdasar.core.data.Bar;
import com.fikri.springdasar.core.data.Foo;
import com.fikri.springdasar.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {


    private ApplicationContext applicationContext;


    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfig.class);
    }


    @Test
    void withOutDI() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testDI() {
        var foo = applicationContext.getBean(Foo.class);
        var bar = applicationContext.getBean(Bar.class);
        var fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
