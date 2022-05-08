package Builderdesignpattern;

public class Mainbuilder {
    public static void main(String[] args) {

        TipiBuilder iogbuilder = new TipiBuilder();
        CivilEngineer engineer = new CivilEngineer(iogbuilder);
        engineer.ConstructHouse();
        House home =engineer.getHouse();
        System.out.println(home.toString());

    }
}
