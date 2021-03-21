package observer;

public interface Observable {
    void subscribe(Observer viewer);
    void unsubscribe(Observer viewer);
    void notifyObservers();
    String getUpdate();
}
