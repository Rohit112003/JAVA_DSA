package ust.MutiThreading;

public class MyThread extends  Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Hello from the thread  side");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        t1.join();
        System.out.println(t1.getState());

    }
}
