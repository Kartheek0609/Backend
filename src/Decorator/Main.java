package Decorator;

public class Main {
    public static void main(String[] args) {
        IceCream ic = new OrangeCone(
                         new ChocoSyrup(
                             new ChocolateCone()));
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
