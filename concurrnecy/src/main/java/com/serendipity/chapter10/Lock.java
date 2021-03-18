package com.serendipity.chapter10;

import java.util.Collection;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/10 20:24
 */
public interface Lock {
      class  TimeOutException extends  Exception{
        public TimeOutException(String message){
            super(message);
        }
    }
    void lock() throws InterruptedException;

    void lock(long mills) throws InterruptedException,TimeOutException;

    void unlock();

    Collection<Thread> getBlockedThread();

    int getBlockSize();
}
