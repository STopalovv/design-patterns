package exam;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Subject {

    private List<Observer> observers;
    private String exercise;

    public Trainer() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer viewer) {
        this.observers.add(viewer);
        viewer.setExercise(this);
    }

    @Override
    public void unsubscribe(Observer viewer) {
        this.observers.remove(viewer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return getExercise();
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        System.out.println("Next Exercise: " + exercise);
        this.notifyObservers();
    }
}
