package OOP.interfacePackage;

public class PowerEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}
