package ust.MutiThreading.ExecutorFramework;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
           int finalI =i;
           threads[i-1] = new Thread(
                   ()->{
                       long result = factorial(finalI);
                       System.out.println(result);
                   }
           );
            threads[i-1].start();
        }
        for(Thread thread :threads){
            try{
                thread.join();
            }catch (Exception e){

            }
        }
        System.out.println("Toatal time "+ (System.currentTimeMillis()-startTime));
    }

    private static long factorial(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        long result = 1;
        for (int j = 0; j < i; j++) {
            result*=i;
        }
        return result;
    }
}
