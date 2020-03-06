package com.serendipity.singleton;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/6 22:44
 */
public class Singleton {
    private Singleton(){}

    public static volatile Singleton instance = null;

    public Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}