package ust.oops;

public abstract class Parent {
    static  int age;
    final int value;

    public Parent(int val, int num){
        Parent.age = val;
        value =  num;
    }
      void hello(){
        System.out.println("hey from parent side");
    }
    abstract  void career();
    abstract void patrner();

}
