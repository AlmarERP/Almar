package patronObserver;



import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Observer> registeredObservers;

    public Subject() {
        this.registeredObservers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.update(this);
        }
    }
}
