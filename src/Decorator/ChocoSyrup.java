package Decorator;

public class ChocoSyrup implements IceCream{
    private IceCream icecream;

    public ChocoSyrup(IceCream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 45;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Syrup";
    }
}
