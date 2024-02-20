package Interfaces;

public class Main {
    public static void main(String[] args) {
       /* Deer a= new Deer();
       //Deer reference variable and Deer object
        a.eat();
        a.drink();
        a.walk();*/
        Playanimal p= new Playanimal();
        p.doanimalthings();
        Animal l= new Lion();
        //lion's parent as reference variable and lion object -> upcasting
        l.eat();
        l.drink();
    }
}
