package exam;

public class Instructor {

    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void tellOrder() {
        this.command.execute();
    }
}
