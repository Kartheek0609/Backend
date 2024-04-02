package Startegy;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination){
        System.out.println("Path via Car from " + source + ", to " + destination);
    }
}
