package FactoryDesignPattern;

import FactoryDesignPattern.Profession;

public class Doctor implements Profession {

    @Override
    public void print() {
        System.out.println("Hello from FactoryDesignPattern.Doctor");
    }
}
