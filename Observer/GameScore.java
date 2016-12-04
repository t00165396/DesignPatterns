package Observer;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public class GameScore implements Observable{
    private int score;
    private int fruitEaten;
    private ArrayList<Observer> observers;

    public GameScore(){

        observers=new ArrayList<Observer>();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer :observers){

            observer.update(score,fruitEaten);
        }
    }

    public void scoreChanged(){

        notifyObservers();
    }

    public void increaseScore(int score){

        score++;
        //fruitEaten++;
        System.out.print(score);
        scoreChanged();

    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);

        if(i>=0){

            observers.remove(i);
        }

    }
}
