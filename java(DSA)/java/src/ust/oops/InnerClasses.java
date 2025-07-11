package ust.oops;

public class InnerClasses {

    static class test{
        String name;
        test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test tes = new test("rohit");
        System.out.println(tes);
    }
}
