package ust.oops;

public class Son extends Parent{
    public Son(int val,int num) {
        super(val,num);
    }

//    @Override
//    void hello(){
//        super.hello();
//    }
    @Override
    void career() {
        System.out.println("I choose my career");
    }

    @Override
    void patrner() {
        System.out.println("I choose my partner ");
    }
}
