package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportClass;

public class Main {
    public static void main(String[] args){
        Engine e1=new Engine(150,"BMW");
        Engine e2=new Engine(120,"Volvo");
        Driver d1= new Driver("Ivan Ivanov",40,15);



        final int size=2;
        Car[] mas=new Car[size];
        Lorry l1= new Lorry("Lorry","MAN",e2,d1,120);
        SportClass s1= new SportClass("SportCar","bmw",e1,d1,180.0);

        mas[0]=l1;
        mas[1]=s1;


        for(Car s:mas){
            System.out.print( "\n"+s + "\n");
        }
    }
}
