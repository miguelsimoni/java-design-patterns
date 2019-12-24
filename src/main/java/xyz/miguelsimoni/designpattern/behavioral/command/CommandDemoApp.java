package xyz.miguelsimoni.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemoApp {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        List<Command> commands = Client.prepareCommands();

        invoker.setCommands(commands);

        invoker.executeCommands();
    }

}
