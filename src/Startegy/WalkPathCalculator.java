package Startegy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination){
        System.out.println("Path via Walk from " + source + ", to " + destination);
    }
}
