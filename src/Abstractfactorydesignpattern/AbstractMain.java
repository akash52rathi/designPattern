package Abstractfactorydesignpattern;

public class AbstractMain {

    public static void main(String[] args) {
        Abstractfactory abstractfactory = AbstractfactoryProducer.getprofession(false);
        Profession eng = abstractfactory.getprofession("Engineer");
        eng.print();
    }
}
