package com.company.professions;

import com.company.Person;

public class Driver extends Person {

    private int experience;

    Driver(){}

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }



}
