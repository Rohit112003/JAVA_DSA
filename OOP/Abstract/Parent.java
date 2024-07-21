package OOP.Abstract;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
    }
    static void hello(){
        System.out.println("Hey");
    }
    void normal(){
        System.out.println("this is a normal method");
    }
    //you can create abstract constructor
    abstract void carrer();
    abstract  void partner();
}
