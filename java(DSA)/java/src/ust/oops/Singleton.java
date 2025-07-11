package ust.oops;

public class Singleton {
    private Singleton(){}

    private static  Singleton instance;

    private static Singleton  getInstance(){
        if(instance==null){
             instance = new Singleton();
        }
        return instance;
    }
}
