package Observer;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public interface Observable {
    public void addObserver (Observer obs);
    public void notifyObservers();
}
