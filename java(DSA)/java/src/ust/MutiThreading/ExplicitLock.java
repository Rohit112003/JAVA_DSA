package ust.MutiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitLock {
    private int balance;
    private final Lock lock = new ReentrantLock();


    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " Processing the current withdrawal of " + amount);
                        Thread.sleep(10000);
                        balance -= amount;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Couldn't acquire lock to withdraw " + amount);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }


}
