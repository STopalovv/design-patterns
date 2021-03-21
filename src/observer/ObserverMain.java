package observer;

public class ObserverMain {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Observer observer1 = new Viewer("George");
        Observer observer2 = new Viewer("Peter");
        Observer observer3 = new Viewer("Mark");

        instructor.subscribe(observer1);
        instructor.subscribe(observer2);
        instructor.subscribe(observer3);

        instructor.setExercise("Bench press");
    }
}
