package Observer;

/**
 * Created by lirandakrasniqi on 04/12/2016.
 */
public class TestObserver {
    public static void main(String args[])
    {

        GameScore g=new GameScore();
        iGame ig=new iGame(g);
        int score=2;
        g.increaseScore(score);
    }





}


