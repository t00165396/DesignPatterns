package CommandPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import Observer.*;

import Strategy.*;

/**
 * Created by lirandakrasniqi on 05/12/2016.
 */
public class Game extends JFrame implements KeyListener {
    private GameCommands g;
    int dx,dy;
    Snake snake=new Snake();
    Fruit apple=new Fruit();
    private int score;

    public Game(){
        super("Snake Game");
       // g=new GameCommands();
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
            InvokeCommands control = new InvokeCommands();
            GameCommands g = new GameCommands();
            QuitGameCommand quitGameCommand = new QuitGameCommand(g);
            SnakeAteFoodCommand snakeAte=new SnakeAteFoodCommand(g);
            SnakeHitItselfCommand snakeHitItselfcommand=new SnakeHitItselfCommand(g);
            Point  snakeHead=snake.getSnakesHead();
            GameScore gameScore =new GameScore();


            snake.moveSnake(dx,dy);


        //when snake eats food c
            if (snake.getSnakesHead().equals(apple.getApplePosition())){

                control.setCommand(snakeAte);
                control.pressButton();
                apple.move();
                snake.growSnake(3);
                gameScore.increaseScore(score);

            }

            //if snake hits wall
            if(snakeHead.x <= 0 ||
                    snakeHead.x >= 800/15 ||
                    snakeHead.y <= 1.5 ||
                    snakeHead.y >= 600/15.5) {

                control.setCommand(quitGameCommand);
                control.pressButton();

            }

            if(snake.getSnakeSize()>=7) {

                for (int i = 1; i < snake.getSnakeSize(); i++) {
                    if (snakeHead.equals(snake.getSnakeBody(i))) {
                        control.setCommand(snakeHitItselfcommand);
                        control.pressButton();

                    }
                }
            }



            while(System.currentTimeMillis()-time < 90) {
                //if time is less than 90 do nothing

            }
        }
    }//end of constructor


    public void startGame() {
        drawBlackBackground();
    }


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
