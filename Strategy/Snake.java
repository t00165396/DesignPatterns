package Strategy;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public class Snake extends MoveObject {

    private LinkedList<Point> snakeBody;
    private Point snakesHead;

    ObjectPosition position=new ObjectPosition();

    public Snake(){
        super();

        snakeBody=new LinkedList<Point>();
        snakeBody.addFirst(new Point(20,20));//  Returns the first element in this list.in this case it would be thehead of the snakeGame
    }

    public Point getSnakesHead(){
        return  snakeBody.getFirst();
    }

    public int getSnakeSize(){return snakeBody.size();}

    public Point getSnakesTail(){
        return  snakeBody.getLast();//

    }



    public void growSnake(int n) {
        while (n > 0) {

            snakeBody.add(new Point(snakeBody.getLast()));
            n--;
        }



    }


    @Override
    public void move( ) {

        for (int i = snakeBody.size() - 1; i >= 1; i--) {
            snakeBody.get(i).setLocation(snakeBody.get(i - 1));
        }
        snakesHead=snakeBody.getFirst();
        snakesHead.x += position.getDx();
        snakesHead.y += position.getDy();

    }

    @Override
    public void drawObject(Graphics g) {
        for (int i = 0; i < snakeBody.size(); i++) {
            g.setColor(Color.GREEN);
            Point p = snakeBody.get(i);
            g.fillOval(p.x * 15, p.y * 15, 15, 15);
        }

    }

    public void moveSnake( int dx, int dy) {


        for (int i = snakeBody.size() - 1; i >= 1; i--) {
            snakeBody.get(i).setLocation(snakeBody.get(i - 1));
        }
        snakesHead=snakeBody.getFirst();
        snakesHead.x += dx;
        snakesHead.y += dy;




    }
}