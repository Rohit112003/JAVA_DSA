package OOP.interfacePackage;

public class ElectricEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerates");

    }
}
