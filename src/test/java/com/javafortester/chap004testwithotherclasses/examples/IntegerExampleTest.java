package com.javafortester.chap004testwithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {


    @Test
    public void integerExploration (){
        Integer four = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer five = Integer.valueOf("5");
        assertEquals("intValue returns int 5", 5, five.intValue() );
    }

    @Test
    public void tryToHexString (){
//       String eleven = Integer.toHexString(11);
       assertEquals("11 becomes b", "b", Integer.toHexString(11)); // this is the same as above

       String ten = Integer.toHexString(10);
       assertEquals("10 becomes a", "a", ten);

       String tree = Integer.toHexString(3);
       assertEquals("3 becomes 3", "3", tree);

       String twentyOne = Integer.toHexString(21);
       assertEquals("21 become 15", "15", twentyOne);
    }

    @Test
    public void checkMinMaxIntegerValues (){
//        int minimum = Integer.MIN_VALUE;
        assertEquals("minimum int value is -2147483648",-2147483648, Integer.MIN_VALUE); // this is the same as above

        int maximum = Integer.MAX_VALUE;
        assertEquals("maximum int value is 2147483647", 2147483647, maximum);
    }
}
