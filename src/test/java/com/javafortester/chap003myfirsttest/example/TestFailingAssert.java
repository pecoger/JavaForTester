package com.javafortester.chap003myfirsttest.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestFailingAssert {

    @Test
    public void isFalse (){
        boolean answer = false;
        assertTrue("should be true",answer);
    }
}