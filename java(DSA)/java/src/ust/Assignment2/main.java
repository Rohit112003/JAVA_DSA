package ust.Assignment2;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("default length " +rectangle.length+ " default breadth "+ rectangle.breadth );
        Rectangle rectangle1 = new Rectangle(15,20);
        System.out.println("length " +rectangle1.length+ " breadth "+ rectangle1.breadth );
    }
}
