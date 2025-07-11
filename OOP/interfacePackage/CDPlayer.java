package OOP.interfacePackage;

public class CDPlayer implements Media{
    @Override
    public void Start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stops");
    }
}
