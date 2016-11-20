package Strategy;

import java.awt.*;
import java.util.Random;

/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public class fruit extends MoveObject {

    private Point apple;
    Random position = new Random();

    public fruit() {

        apple = new Point(20, 10);
    }


    public void drawApple(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(apple.x * 15, apple.y * 15, 15, 15);
    }


    @Override
    public void move() {
        apple.x = position.nextInt((800 / 15) - 4) + 2;
        apple.y = position.nextInt((600 / 15) - 5) + 3;


    }
}




