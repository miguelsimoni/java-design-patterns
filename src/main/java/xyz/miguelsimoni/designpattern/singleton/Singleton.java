package xyz.miguelsimoni.designpattern.singleton;

/**
 * Singleton Design Pattern.
 */
public class Singleton {

    /**
     * Single instance.
     */
    private static Singleton instance;

    /**
     * Private default constructor prevents the class to be instantiated by other means.
     */
    private Singleton() {}

    /**
     * Return the current instance of the class. Create it if does not exist.
     */
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }    
}