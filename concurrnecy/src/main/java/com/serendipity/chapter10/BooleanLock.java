package com.serendipity.chapter10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/**
 * @author serendipity
 * @version 1.0
 * @date 2020/3/10 20:27
 */
public class BooleanLock implements Lock {

    private  boolean initValue;

    private Collection<Thread> blockedThreadCollection = new ArrayList<>();

    public BooleanLock() {
        this.initValue = false;
    }

    @Override
    public synchronized void lock() throws InterruptedException {
        while (initValue){
            blockedThreadCollection.add(Thread.currentThread());
            this.wait();
        }
        blockedThreadCollection.remove(Thread.currentThread());
        this.initValue = true;
    }

    @Override
    public void lock(long mills) throws InterruptedException, TimeOutException {

    }

    @Override
    public synchronized void unlock() {
        this.initValue = false;
       // System.out.println(Thread.currentThread()+" release the lock monitor.");
        Optional.of(Thread.currentThread()+" release the lock monitor.")
                .ifPresent(System.out::println);
        this.notifyAll();
    }

    @Override
    public Collection<Thread> getBlockedThread() {
        return Collections.unmodifiableCollection(blockedThreadCollection);
    }

    @Override
    public int getBlockSize() {
        return blockedThreadCollection.size();
    }
}
