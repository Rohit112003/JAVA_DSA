package ust.MutiThreading;

public class World extends Thread{
    @Override
    public void run() {
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
