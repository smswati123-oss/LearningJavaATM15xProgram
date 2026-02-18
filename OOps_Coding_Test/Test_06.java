package OOps_Coding_Test;

public class Test_06 {
    //Create a Vehicle base class with start() method.
    // Create Car and Bike subclasses that override the start() method.
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
class Vehicle{
    void start(){
        System.out.println("Vehicle start");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car start");
    }
}
class  Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike start");
    }
}
