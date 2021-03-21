package observer;

public class Viewer<String> implements Observer {

    private String name;
    private Observable exercise;

    public Viewer(String name) {
        this.setName(name);
    }

    @Override
    public void update() {

        if(exercise == null) {
            System.out.println(this.getName() + " has no active exercise");
            return;
        }

        String newExercise = (String) exercise.getUpdate();
        System.out.println(this.getName() + ": received new exercise: " + newExercise);
    }

    @Override
    public void setExercise(Observable exercise) {
        this.exercise = exercise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
