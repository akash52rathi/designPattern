package Singleton;

public class Singletonmain {

    public static void main(String[] args) {

        SingletonObjectClass singletonobject =  SingletonObjectClass.getSingletoninstance();
        singletonobject.simplemethod();

        SingletonObjectClass singletonobject2 =  SingletonObjectClass.getSingletoninstance();
        singletonobject2.simplemethod();

    }
}
