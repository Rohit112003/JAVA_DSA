package OOP.PolyMorphism;

public class Numbers {
    int sum(int a, int b ){
        return a+b;
    }
    int sum(int a  , int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers object = new Numbers();
        object.sum(2,4);
        object.sum(4,5,6);
    }
}
