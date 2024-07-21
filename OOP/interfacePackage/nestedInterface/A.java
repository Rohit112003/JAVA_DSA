package OOP.interfacePackage.nestedInterface;

public class A {
    public interface Nestedinterface{
        boolean isOdd(int num);
    }
}

class B implements A.Nestedinterface{

    @Override
    public boolean isOdd(int num) {
        return (num& 1)==1;
    }
}

class  Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));
    }
}