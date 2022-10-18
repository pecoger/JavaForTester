package com.javafortester.chap007basicsofjavarevisited.examples;

import com.javafortester.chap001.examples.classes.*;
import com.javafortester.domainentities.User;
import org.junit.Test;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class ImportTest {

    @org.junit.Test
    public void nonImportTest(){
        org.junit.Assert.assertEquals(3, 2 + 1);
    }

    @Test
    public void importClassNameTest(){
        User user = new User();
    }

    @Test
    public void importClassWithWildcard(){
        AClassWithAMethod aClass = new AClassWithAMethod();
        AnEmptyClass emptyClass = new AnEmptyClass();
    }

    @Test
    public void nonStaticImport(){
        Assert.assertEquals(5, 2 + 3);
        assertEquals(6, 4 + 2);
    }
}
