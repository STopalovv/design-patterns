package observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Observable {

    private List<Observer> observers;
    private String exercise;

    public Instructor() {
        this.observers = new ArrayList<>();
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
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.getExercise();
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        this.notifyObservers();
    }

}
