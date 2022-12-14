package com.javafortester.chap006domainentities.examples;

import com.javafortester.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser (){
        User user = new User(); //we instantiated new user
    }

    @Test
    public void userHasDefaultUsernameAndPassword (){
        User user = new User();

        assertEquals("default user name expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");

        assertEquals("given username expected", "admin", user.getUsername());

        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }
}
