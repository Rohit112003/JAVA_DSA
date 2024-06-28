package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.carrer();
        Daughter daughter = new Daughter(28);
        daughter.carrer();
        Parent.hello();
        son.normal();
//you cannot create object of abstract class you can but you have to override the methods
//        Parent mom = new Parent();
    }
}
