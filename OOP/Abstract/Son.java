package OOP.Abstract;

public class Son extends  Parent{

    public Son(int age){
       super(age);
    }
    @Override
    void carrer() {
        System.out.println("Im goint to be a  Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pratibha her age is 24");
    }
}
