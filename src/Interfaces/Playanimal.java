package Interfaces;

public class Playanimal {
    private Animal animal;

    public Playanimal(){
        animal = new Deer();
    }
    public void doanimalthings(){
        animal.walk();
        animal.eat();
        animal.drink();
    }

}
