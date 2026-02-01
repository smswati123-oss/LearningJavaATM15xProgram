package Oops.Abstraction;

public class Car2 implements Breaks,Engine{
    void drive() {
        startengine();
        applybreak();
        stopengine();
        testengine();
    }

    @Override
    public void applybreak() {
        System.out.println("applybreak");
    }

    @Override
    public void stopengine() {
        System.out.println("stopengine");
    }
    @Override
    public void startengine() {
        System.out.println("startengine");
    }

}
