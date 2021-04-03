package exam;

public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();
        Trainer trainer = new Trainer();
        CommandFactory commandFactory = new Factory(trainer);

        Observer observer1 = new Viewer("George");
        Observer observer2 = new Viewer("Peter");
        Observer observer3 = new Viewer("Mark");

        Command up = commandFactory.GetCommand("Get up!");
        Command down = commandFactory.GetCommand("Lay down!");

        trainer.subscribe(observer1);
        trainer.subscribe(observer2);
        trainer.subscribe(observer3);

        instructor.setCommand(up);
        instructor.tellOrder();

        instructor.setCommand(down);
        instructor.tellOrder();
    }
}
