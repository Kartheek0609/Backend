package MethodOverRiding;

import java.sql.SQLOutput;

public class ElectricCar extends Car{
    @Override
    public void startEngine(){
        System.out.println("Starting battery pack");
        System.out.println("Starting the motor");
    }

}
