package CommandPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by lirandakrasniqi on 05/12/2016.
 */
public class Game extends JFrame{
    private GameLayout g;



    public Game(){
        super("Snake GameLayout");
        g=new GameLayout();
        g.createLayout();
        setSize(800,600);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        g.createLayout();
        drawBlackBackground();



    }
    public void drawBlackBackground() {
        try {

            BufferStrategy buffer = this.getBufferStrategy();
            Graphics g = buffer.getDrawGraphics();
            //System.out.print(snake.getSnakesHead());

            // creates the black background
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 800, 600);//gives the rect the same height and width as window

            //Snake and food are drawn on to the black rectangle
           // snake.drawObject(g);
            //apple.drawObject(g);



            // Shows the contents of the backbuffer on the screen.
            buffer.show();
        }catch (Exception e)
        {

            System.out.print(e.toString());
        }
    }

}
