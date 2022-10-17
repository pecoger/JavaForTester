package com.javafortester.chap007basicsofjavarevisited.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClassExampleTest {

    @Test
    public void variableNaming(){
        String $aString = "bob";
        float £owed = 10F;
        int aMoumt = 4;
        long Amount = 5;
        String A0123456789Cd$f = "ugh";

        assertEquals(4, aMoumt);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789Cd$f);
    }

    @Test
    public void bigBagTestForClassExample(){

        assertEquals(ClassExample.CONSTANT, "a constant string");
        assertEquals(ClassExample.aClassField, "a class field");

        ClassExample.aClassField = "new value";
        assertEquals(ClassExample.aClassField, "new value");

        ClassExample instance = new ClassExample("bob");
        assertEquals("bob", instance.getName());

        instance.setName("test");
        assertEquals("test", instance.getName());

        instance.aClassField = "changed";
        assertEquals("changed", instance.aClassField);

        assertEquals(instance.pubField, "a public field");
        instance.pubField = "amended public field";
        assertEquals(instance.pubField, "amended public field");


    }
}
