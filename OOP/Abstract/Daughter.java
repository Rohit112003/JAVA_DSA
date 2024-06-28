package OOP.Abstract;

public class Daughter extends  Parent {
    Daughter(int age){
        super(age);
    }
    @Override
    void carrer() {
        System.out.println("Im goint to be a Doctor" );
    }

    @Override
    void partner() {
        System.out.println("I love someone age don't no ");
    }
}
