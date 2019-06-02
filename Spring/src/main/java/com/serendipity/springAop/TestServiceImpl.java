package com.serendipity.springAop;

public class TestServiceImpl implements TestService {
    public void test(String str) {
        System.out.println("TestServiceImpl run : " + str);
    }

}
