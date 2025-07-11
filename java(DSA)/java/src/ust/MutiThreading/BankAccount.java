package ust.MutiThreading;

public class BankAccount {
    private int balance=1000;
    public synchronized void withdrawl(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + amount);
        if(balance>= amount){
            System.out.println(Thread.currentThread().getName()+ "Processing the current withdrawl"+ amount);
            Thread.sleep(10000);
            balance-=amount;
        }else{
            System.out.println("Insufficient balance" + Thread.currentThread().getName());
        }
    }
}
