package xyz.miguelsimoni.designpattern.behavioral.command;

import java.util.List;

/**
 * Command Invoker.
 */
public class Invoker {

    private List<Command> commands;

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
