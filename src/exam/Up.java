package exam;

public class Up implements Command{

    private Trainer workout;
    private String exercise;

    public Up(Trainer workout) {
        this.workout = workout;
        this.setExercise("Get up!");
    }

    @Override
    public void execute() {
        this.workout.setExercise(getExercise());
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }
}
