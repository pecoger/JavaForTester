package com.javafortester.chap005testwithourownclasses.domainobject.examples;

import com.javafortester.domainobject.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically (){
        //calling and creating a method (getURL()) via IDE options
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getURL());
        //calling and creating a constant field (URL) via IDE options
        //assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.URL);
        assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }
}
