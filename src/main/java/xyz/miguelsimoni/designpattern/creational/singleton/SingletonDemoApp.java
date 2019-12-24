package xyz.miguelsimoni.designpattern.creational.singleton;

/**
 * Singleton Design Pattern Demo Application.
 */
public class SingletonDemoApp {

    public static void main(String[] args) {
        System.out.println("--- Design Pattern Singleton Demo Application ---");

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1 -> " + s1.toString());
        System.out.println("s2 -> " + s2.toString());
        System.out.println("s1 == s2 -> " + (s1 == s2));
    }

}
