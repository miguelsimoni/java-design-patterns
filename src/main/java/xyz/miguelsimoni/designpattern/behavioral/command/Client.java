package xyz.miguelsimoni.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Client.
 */
public class Client {

    public static List<Command> prepareCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new ConcreteCommand(1));
        commands.add(new ConcreteCommand(2));
        commands.add(new ConcreteCommand(3));
        return commands;
    }

}
