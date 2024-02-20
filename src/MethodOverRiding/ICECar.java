package MethodOverRiding;

public class ICECar extends Car{
    @Override
    public void startEngine() {
        System.out.println("Consuming petrol/diesel");
        System.out.println("Starting combustion");
        System.out.println("Engine starts");
    }
}
