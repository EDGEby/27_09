package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(){}

    public Lorry(String carClass, String brand, Engine engine, Driver driver, int carrying) {
        super(carClass, brand, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", carrying=" + carrying + "kg"+
                '}';
    }
}
