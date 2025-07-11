package ust.MutiThreading;

public class Counter {
    private int count =0;
    //we can add synchronized in method as well as in perticular property
    public synchronized void increment(){
//        synchronized (this){
//            count++;
//        }
        count++;

    }
    public int getCount(){
        return count;
    }
}
