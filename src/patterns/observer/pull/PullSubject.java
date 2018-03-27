import java.util.List;
import java.util.ArrayList;

public class PullSubject {

    private List<PullObserver> observers;

    public PullSubject() {
        observers = new ArrayList<PullObserver>();
    }

    public void registerObservers(PullObserver o) {
        observers.add(o);
    }

    public void unregisterObservers(PullObserver o) {
        observers.remove(o);
    }

    public void clearObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        observers.forEach( o -> o.update() );
    }
}