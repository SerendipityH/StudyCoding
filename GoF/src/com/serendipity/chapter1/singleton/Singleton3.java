package com.serendipity.chapter1.singleton;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/7 10:18
 */
public class Singleton3 {
    private Singleton3(){}

    private static class Holder{
        private static Singleton3 instance = new Singleton3();
    }

    private static Singleton3 getInstance(){
        return Holder.instance;
    }
}
