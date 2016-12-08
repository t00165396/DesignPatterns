package Observer;

import java.awt.*;


/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public class iGame implements Observer, DisplayElement{


    private int score;
    private int fruitEaten;
    private Observer ob;
    private Observable subject;

    public iGame()
    {


    }

public iGame(Observable ob)
{
    this.subject=ob;
    ob.addObserver(this);

}

    @Override
    public void update(int score, int fruitEaten) {
        this.score=score;
       this.fruitEaten=fruitEaten;
    }


    @Override
    public void display(Graphics g) {
        g.setColor(Color.white);
        g.drawString("Score: " + score, 10, 60);
        g.setColor(Color.white);
        g.drawString("Fruit Eaten: " + fruitEaten, 80, 60);
    }
}

