package xyz.miguelsimoni.designpattern.behavioral.command;

/**
 * Concrete Command Implementation.
 */
public class ConcreteCommand implements Command {

    private final int commandNumber;

    public ConcreteCommand(int commandNumber) {
        this.commandNumber = commandNumber;
    }

    @Override
    public void execute() {
        Receiver.action("Command " + commandNumber + " executed.");
    }

}
