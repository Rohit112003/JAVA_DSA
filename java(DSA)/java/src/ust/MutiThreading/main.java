package ust.MutiThreading;

public class main {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        for(; ;){
            System.out.println("Hello");
        }
    }
}
