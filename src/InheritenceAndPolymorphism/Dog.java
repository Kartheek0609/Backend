package InheritenceAndPolymorphism;

public class Dog extends Animal{
    public String name;

    public Dog(String furColor, String eyeColor, int noofLegs) {
        super(furColor, eyeColor, noofLegs);
    }
}
