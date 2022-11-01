package com.fikri.springdasar;

import com.fikri.springdasar.core.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatabaseTest {


    @Test
    void singletonTest() {

        var db1 = Database.getInstance();
        var db2 = Database.getInstance();

        Assertions.assertEquals(db2,db1);
    }
}
