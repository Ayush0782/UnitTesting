package com.test.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenericMethodTest {

    @Autowired
    GenericMethod genericMethod;

    @Test
    void getFirstCharacter() {
        char res = genericMethod.getFirstCharacter("Ayush");
        Assertions.assertEquals('A',res);
    }

    @Test
    void getLastCharacter() {
        char res = genericMethod.getLastCharacter("Ayush");
        Assertions.assertEquals('h',res);
    }
}