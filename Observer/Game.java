package Observer;

import Strategy.fruit;
import Strategy.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by lirandakrasniqi on 04/12/2016.
 */
public class Game {


    private static  int windowWidth = 800;
    private static int windowHeight = 600;
    snake snake =new snake();
    fruit apple=new fruit();
    JFrame f;
    int dx=0, dy=0;

    public Game() {

        f = new JFrame();
        snake snake = new snake();
        fruit apple = new fruit();
        f.setSize(800, 600);
        f.setLocation(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
        f.createBufferStrategy(2);
        //f.addKeyListener(this);
        drawBlackBackground();
        snake.moveSnake(dx, dy);

        while (true) {
            long time = System.currentTimeMillis();//belongs to the system class and is used to return time in milliseconds
            snake.moveSnake(dx, dy); //this method calls all of the othe rmethods that are needed to start game
            snake.growSnake(4);
            while (System.currentTimeMillis() - time < 90) {
                //if time is less than 90 do nothing

            }
        }
    }
    public void drawBlackBackground() {
        try {

            BufferStrategy buffer = f.getBufferStrategy();
            Graphics g = buffer.getDrawGraphics();
            System.out.print(snake.getSnakesHead());

            // creates the black background
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, windowWidth, windowHeight);//gives the rect the same height and width as window

            //snake and food are drawn on to the black rectangle
            //snake.drawSnake(g);
            //apple.drawApple(g);



            // Shows the contents of the backbuffer on the screen.
            buffer.show();
        }catch (Exception e)
        {

            System.out.print(e.toString());
        }
    }


    }

