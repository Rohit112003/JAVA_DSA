package ust.MutiThreading;

public class AccountHolder {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    sbi.withdrawl(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(run, "Thrad1");
        Thread t2 = new Thread(run, "Thread2");

    }
}
