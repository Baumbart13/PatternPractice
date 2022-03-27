package at.htlinn;

import java.util.LinkedList;
import java.util.List;

public abstract class Observable {
    private final List<Observer> observers = new LinkedList<Observer>();

    public void add(Observer o) {
        this.observers.add(o);
    }

    public Observer remove(Observer o) {
        return observers.remove(observers.indexOf(o));
    }

    public void notifyAllMyObservers(int warningLevel) {
        for (var e : observers) {
            e.update(this, warningLevel);
        }
    }

    public abstract String toString();
}
