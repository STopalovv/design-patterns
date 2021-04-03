package exam;

public class Down implements Command {

    private Trainer workout;
    private String exercise;

    public Down(Trainer workout) {
        this.workout = workout;
        this.setExercise("Lay down!");

    }

    @Override
    public void execute() {
        this.workout.setExercise(this.getExercise());
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }
}
