package OOP.PolyMorphism;

public class MaIN {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();

        Shapes square = new Square();
                        // it will always acces the object name function

//        shape.area();
//        circle.area();
        square.area();
    }
}
