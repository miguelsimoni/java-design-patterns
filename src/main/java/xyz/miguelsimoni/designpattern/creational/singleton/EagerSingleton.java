package xyz.miguelsimoni.designpattern.creational.singleton;

/**
 * Singleton Design Pattern.
 */
public class EagerSingleton {

/**
 * Single instance.
 */
private static final EagerSingleton instance = new EagerSingleton();

/**
 * Return the current instance of the class. Create it if does not exist.
 */
public static EagerSingleton getInstance() {
        return instance;
        }
        }
