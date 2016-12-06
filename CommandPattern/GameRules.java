package CommandPattern;

/**
 * Created by lirandakrasniqi on 05/12/2016.
 */


public interface GameRules {


    public int increaseScore();
    public void gameOver();
    public void restartGame();
    public void snakeHitWall();
    public void snakeAteFruit();
    public void snakeHitItself();
}
