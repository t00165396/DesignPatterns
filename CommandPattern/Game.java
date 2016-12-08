package CommandPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.LinkedList;
import Strategy.*;

/**
 * Created by lirandakrasniqi on 05/12/2016.
 */
public class Game extends JFrame implements KeyListener {
    private GameLayout g;
    int dx,dy;
    Snake snake=new Snake();
    Fruit apple=new Fruit();



    public Game(){
        super("Snake Game");
       // g=new GameLayout();
        setSize(800,600);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        this.createBufferStrategy(2);
        this.addKeyListener(this);
        snake.growSnake(5);




        while(true) {
            long time = System.currentTimeMillis();//belongs to the system class and is used to return time in milliseconds
            drawBlackBackground();//this method calls all of the othe rmethods that are needed to start game
            snake.moveSnake(dx,dy);

            while(System.currentTimeMillis()-time < 90) {
                //if time is less than 90 do nothing

            }
        }
    }//end of constructor


    public void startGame() {
        drawBlackBackground();}


    public void drawBlackBackground() {
        try {

            BufferStrategy buffer = this.getBufferStrategy();
            Graphics g = buffer.getDrawGraphics();

            // creates the black background
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.BLACK);



            snake.drawObject(g);
            apple.drawObject(g);

            // Shows the contents of the backbuffer on the screen.
            buffer.show();
        }catch (Exception e)
        {

            System.out.print(e.toString());
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_DOWN) {
            dy=1;
            dx=0;
        } else if(key == KeyEvent.VK_UP) {
            dy=-1;
            dx=0;
        } else if(key == KeyEvent.VK_RIGHT) {
            dy=0;
            dx=1;
        } else if(key == KeyEvent.VK_LEFT) {
            dy=0;
            dx=-1;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
