package Decorator;

public class VanilaScoop implements IceCream{
    private IceCream icecream;

    public VanilaScoop(IceCream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 65;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Vanila Scoop";
    }
}
