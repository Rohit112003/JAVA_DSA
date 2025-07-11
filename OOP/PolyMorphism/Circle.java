package OOP.PolyMorphism;

public class Circle extends Shapes{
    //this will run when obj of circle is created
    //hence it is is overriding the parent method
    @Override // this callled annotations
    void area(){
        System.out.println("Area of circle is pie * r**2");
    }
}
