package Observer;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public interface Observable {
    public void addObserver (Observer o);
    public void notifyObservers();
    public void removeObserver(Observer o);
}
