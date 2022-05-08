package FactoryDesignPattern;

public class FactoryPatternMainClass {

    public static void main(String[] args) {

        Professionfactory professionfactory = new Professionfactory();
        Profession doctor1 = professionfactory.getProfession("FactoryDesignPattern.Doctor");
        Profession teacher1 = professionfactory.getProfession("teacher");
        doctor1.print();
        teacher1.print();
    }
}
