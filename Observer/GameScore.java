package Observer;

import java.awt.*;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public class GameScore implements Observer{
    private int score;
    private int fruitEaten;

    public void drawScore(Graphics g) {
        g.setColor(Color.white);
        g.drawString("Score: " + score, 10, 60);
        g.setColor(Color.white);
        g.drawString("Fruit Eaten: " + fruitEaten, 80, 60);

    }


    @Override
    public void update() {
        score++;

    }

    @Override
    public void setObserver(Observable ob) {

    }
}
