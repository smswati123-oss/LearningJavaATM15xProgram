package Oops.Abstraction;

public interface Engine {
    void startengine();

    void stopengine();

    default void testengine() {
        System.out.println("concrete default");

    }
}
