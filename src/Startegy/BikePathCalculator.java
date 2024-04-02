package Startegy;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination){
        System.out.println("Path via Bike from " + source + ", to " + destination);
    }
}
