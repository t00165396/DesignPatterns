import java.awt.*;

/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public class fruit {

    private Point apple;

    public fruit(){

        apple = new Point(20,10);
    }


    public void moveApple() {
        //apple.x = position.nextInt((windowWidth/15)-4)+2;
        //apple.y = position.nextInt((windowHeight/15)-5)+3;
    }

    public void drawApple(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(apple.x*15, apple.y*15, 15, 15);
    }

}
