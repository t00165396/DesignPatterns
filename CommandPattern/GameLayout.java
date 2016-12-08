package CommandPattern;

import Observer.Observable;
import Observer.Observer;
import Strategy.Fruit;
import Strategy.Snake;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;


/**
 * Created by lirandakrasniqi on 05/12/2016.
 */
public class GameLayout implements GameRules, Observable{
    private Snake snake;
    private Fruit apple;
    private int score;
    private int fruitEatten;
    private static  int windowWidth ;
    private static int windowHeight ;

    public GameLayout(){

        createLayout();
    }

    Point snakeHead;
    private ArrayList<Observer> observers=new ArrayList<Observer>();;

    public void createLayout(){
    snake=new Snake();

        apple =new Fruit();

        windowWidth=800;
        windowHeight=600;



    }


    @Override
    public int increaseScore() {
        score+=100;
        fruitEatten++;
        System.out.print(score);
        return score;
    }

    @Override
    public void gameOver() {
        JOptionPane.showMessageDialog(null,"GameLayout over");
        restartGame();

    }

    @Override
    public void restartGame() {
        int newGame = JOptionPane.showConfirmDialog(null,"Would you like to play another game","Another GameLayout?",JOptionPane.YES_NO_OPTION);

        if(newGame==0)//If yes selected
        {
            GameLayout s2=new GameLayout();
        }
        if(newGame==1)//If no selected
        {

            System.exit(0);
        }

    }

    @Override
    public void snakeHitWall() {
        snakeHead=snake.getSnakesHead();

        if(snakeHead.x <= 0 ||
                snakeHead.x >= windowWidth/15 ||
                snakeHead.y <= 1.5 ||
                snakeHead.y >= windowHeight/15.5) {

            gameOver();

        }
    }

    @Override
    public void snakeAteFruit() {
        snakeHead=snake.getSnakesHead();

        //if snakeGame has eaten apple
        if (snakeHead.equals(apple)) {
            apple.move();
            snake.growSnake(3);
            increaseScore();
            notifyObservers();

        }
    }

    @Override
    public void snakeHitItself() {
        if(snake.getSnakeSize()>=7)	{

//            for(int i =1;i<snake.getSnakeSize();i++)
//            {
//                if(snakeHead.equals(snake.g(i)))
//                {
//                    gameOver();
//
//                }
//            }

        }


    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer :observers){

            observer.update(score,fruitEatten);
        }

    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);

        if(i>=0){

            observers.remove(i);
        }

    }
}
