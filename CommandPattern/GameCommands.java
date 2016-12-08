package CommandPattern;

import Observer.Observable;
import Observer.Observer;
import Strategy.Fruit;
import Strategy.Snake;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


/**
 * Created by lirandakrasniqi on 05/12/2016.
 */
public class GameCommands implements GameRules, Observable{
    private Snake snake;
    private Fruit apple;
    private int score;
    private int fruitEatten;
    private static  int windowWidth ;
    private static int windowHeight ;
    Point snakeHead;
    private ArrayList<Observer> observers=new ArrayList<Observer>();

    public GameCommands(){

        createLayout();
    }

    public void createLayout(){
        snake=new Snake();
        apple =new Fruit();
        windowWidth=800;
        windowHeight=600;
    }


    @Override
    public int increaseScore() {
        score++;
        fruitEatten++;
        System.out.print(score+ fruitEatten);
        return score;
    }

    @Override
    public void gameOver() {
        JOptionPane.showMessageDialog(null,"Game over");
        restartGame();
        System.exit(0);


    }

    @Override
    public void restartGame() {
        int newGame = JOptionPane.showConfirmDialog(null,"Would you like to play another game","Another GameCommands?",JOptionPane.YES_NO_OPTION);

        if(newGame==0)//If yes selected
        {
            GameCommands s2=new GameCommands();
        }
        if(newGame==1)//If no selected
        {

            System.exit(0);
        }

    }

    @Override
    public void snakeHitWall() {
        gameOver();


    }

    @Override
    public void snakeAteFruit() {
        snakeHead=snake.getSnakesHead();

            apple.move();
            snake.growSnake(3);
            increaseScore();
            notifyObservers();


    }

    @Override
    public void snakeHitItself() {

        gameOver();
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
