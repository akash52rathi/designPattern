package Singleton;

public class SingletonObjectClass {
    private  static SingletonObjectClass singletoninstance = new SingletonObjectClass();
    private SingletonObjectClass()
    {

    }

    public static SingletonObjectClass getSingletoninstance()
    {
        return  singletoninstance;
    }

    public  void simplemethod()
    {
        System.out.println("hashcode of singletonObject is"+hashCode());
    }
}
