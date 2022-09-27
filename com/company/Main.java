package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportClass;

public class Main {
    public static void main(String[] args){
        Engine e1=new Engine(150,"BMW");
        Driver d1= new Driver("Ivan Ivanov",40,15);
        Car c1=new Car("Lorry","Volvo",e1,d1);

        System.out.println(c1+"\n\n\n");


        final int size=2;
        Car[] mas=new Car[size];
        Lorry l1= new Lorry("Lorry","MAN",e1,d1,120);
        SportClass s1= new SportClass("SportCar","bmw",e1,d1,180.0);

        for()
    }
}
