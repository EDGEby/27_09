package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportClass extends Car{
    private double speed;

    public SportClass(){};

    public SportClass(String carClass, String brand, Engine engine, Driver driver, double speed) {
        super(carClass, brand, engine, driver);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportClass{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine  +
                ", driver=" + driver +
                ", speed=" + speed + "km/h"+
                '}';
    }

}
