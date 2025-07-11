package ust.MutiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenternatExample {
    private  final Lock lock  =  new ReentrantLock(true);

    public  void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }
    public  void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner Lock");
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ReenternatExample re = new ReenternatExample();
        re.outerMethod();
    }
}
