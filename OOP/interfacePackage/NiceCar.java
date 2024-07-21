package OOP.interfacePackage;

public class NiceCar {
    private  Engine engine;

    public NiceCar(){
        engine = new PowerEngine();
        engine.Start();
    }
}
