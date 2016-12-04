package Observer;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public interface GameRules {
    public int getScore();
    public void quit();
    public void restartGame();
    public void collisionWithWall();
    public void collisionWithfruit();
    public void addObserver(Observer obs);
    public void notifyObservers();
}
