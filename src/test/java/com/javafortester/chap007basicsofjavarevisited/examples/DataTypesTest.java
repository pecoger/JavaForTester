package com.javafortester.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataTypesTest {

    @Test
    public void booleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;
    }

    @Test
    public void integerTypes(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println("* `byte` range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("* `short` range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("* `int` range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("* `long` range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        aLongHas8Bytes = 0L; //add suffix L for long
        assertEquals(0, aLongHas8Bytes);

        aByteHas1Byte = 0xA; //add suffix 0x for Hex
        assertEquals(10, aByteHas1Byte);

        anIntHas4Bytes = 010; //add 'zero' prefix for Octal
        assertEquals(8, anIntHas4Bytes);

        aByteHas1Byte = 0b0010; //Java 1.7 added 0b 'zero b' for binary
        assertEquals(aByteHas1Byte, 2);

        //Java 1.7 allows underscores for readability
        aLongHas8Bytes = 9_000_000_000L; //9 000 million
        assertEquals(9000000000L, aLongHas8Bytes);
    }

    @Test
    public void floatingPointTypes(){
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println("* `float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("* `double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        singlePrecision32bit = 10.0F; //suffix F to get a float
        assertEquals(10F, singlePrecision32bit, 0);

        doublePrecision64bit = 20.0; //default to double
        assertEquals(20D, doublePrecision64bit, 0);
    }

    @Test
    public void characterType(){
        char aChar = '\u0026';
        System.out.println(aChar);
        assertEquals(aChar, '&');
    }
}
