package Abstractfactorydesignpattern;

public class Doctor implements Profession {

    @Override
    public void print() {
        System.out.println("Hi from Doctor");
    }
}
