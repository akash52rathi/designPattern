package FactoryDesignPattern;

import FactoryDesignPattern.Profession;

public class Teacher  implements Profession {
    @Override
    public void print() {
        System.out.println("hello from FactoryDesignPattern.Teacher");
    }
}

