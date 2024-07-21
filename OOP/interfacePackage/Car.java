package OOP.interfacePackage;

public class Car implements Break,Engine,Media {

    @Override
    public void brake() {
        System.out.println("I brake Like a Normal car");
    }

    @Override
    public void Start() {
        System.out.println("I start Like a Normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop Like Normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate Like Normal car");
    }
}
