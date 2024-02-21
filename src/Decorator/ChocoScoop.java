package Decorator;

public class ChocoScoop implements IceCream{
    private IceCream icecream;

    public ChocoScoop(IceCream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 55;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Scoop";
    }
}
