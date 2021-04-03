package exam;

import java.util.HashMap;

public class Factory extends CommandFactory {
    private HashMap<String, Command> command;

    public Factory(Trainer exercise) {
        this.command = new HashMap<String, Command>();

        this.command.put("Get up!", new Up(exercise));
        this.command.put("Lay down!", new Down(exercise));
    }

    @Override
    public Command GetCommand(String command) {
        return this.command.get(command);
    }
}
