package observer;

public class ObserverMain {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Observer observer1 = new Viewer("Viewer 1");
        Observer observer2 = new Viewer("Viewer 2");
        Observer observer3 = new Viewer("Viewer 2");

        instructor.subscribe(observer1);
        instructor.subscribe(observer2);
        instructor.subscribe(observer3);

        instructor.setExercise("New exercise has been released");
    }
}
