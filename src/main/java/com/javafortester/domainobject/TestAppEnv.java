package com.javafortester.domainobject;

public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";
//    public static final String URL = "http://192.123.0.3:67"; The URL could be passed as a field not only with a method

    public static String getURL() {
        return  "http://" + DOMAIN + ":" + PORT; //this way we need to only change value of the fields
    }
}
