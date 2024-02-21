package Decorator;

public class ChocoChip implements  IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost() {
        if(iceCream !=null){
            return iceCream.getCost()+10;
        }
        else{
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream !=null){
            return iceCream.getDescription()+", ChocoChip";
        }
        else{
            return "ChocoChip";
        }
    }
}
