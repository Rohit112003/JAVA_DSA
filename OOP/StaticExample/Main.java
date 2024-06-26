package OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Rohit = new Human("Rohit Kumar" ,21, 10000,false);
        Human Rahul = new Human("Rohit Kumar" ,21, 10000,true    );
        System.out.println(Rohit.population);
        System.out.println(Rahul.population);
        
    }
}
