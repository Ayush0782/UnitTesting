package com.test.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MathematicsTest {

    @Autowired
    Mathematics mathematics;

    @Test
    void getSum() {
      int res =  mathematics.getSum(2,3);
        Assertions.assertEquals(5,res);
    }
    @Test
    void getSum2() {
        int res = mathematics.getSum(4, 3);
        Assertions.assertEquals(7, res);
    }

    @Test
    void getMiddleCharacter() {
        char res =  mathematics.getMiddleCharacter("sonu");
        Assertions.assertEquals('o',res);
    }

    //There is no need to write too many same logical method again and again
    @ParameterizedTest
    @CsvSource({"2,3,5","5,9,14","2,-1,1","3,7,10"})
    void getSumParameterized(int a, int b, int expected) {
        int result =  mathematics.getSum(a,b);
        Assertions.assertEquals(expected,result);
    }
}