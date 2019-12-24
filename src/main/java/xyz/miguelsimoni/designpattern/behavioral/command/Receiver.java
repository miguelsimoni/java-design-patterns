package xyz.miguelsimoni.designpattern.behavioral.command;

/**
 * Receiver.
 */
public class Receiver {

    public static void action(String commandResult) {
        System.out.println(commandResult);
    }

}
