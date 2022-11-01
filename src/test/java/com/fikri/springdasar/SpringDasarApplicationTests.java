package com.fikri.springdasar;

import com.fikri.springdasar.core.HelloWorldConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringDasarApplicationTests {


	@Test
	void createApplicationContext() {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		Assertions.assertNotNull(applicationContext);
	}
}
