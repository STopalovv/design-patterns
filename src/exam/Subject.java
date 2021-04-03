package exam;

public interface Subject {
    void subscribe(Observer viewer);
    void unsubscribe(Observer viewer);
    void notifyObservers();
    String getUpdate();
}
