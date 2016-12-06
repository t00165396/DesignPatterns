package Strategy;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by lirandakrasniqi on 20/11/2016.
 */
public class Snake extends MoveObject {

    private LinkedList<Point> snakeBody= new LinkedList<>();
    private Point snakesHead;
    private Point snakesTail;
    private int x;

    public Snake(){
        super();

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

            snakeBody.add(new Point(snakesTail));
            n--;
        }
    }


    @Override
    public void move( ) {

        int dx=0;
        int dy=0;
        for (int i = snakeBody.size() - 1; i >= 1; i--) {
            snakeBody.get(i).setLocation(snakeBody.get(i - 1));
        }
        snakesHead.x += dx;
        snakesHead.y += 1;

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
        snakesHead.x += dx;
        snakesHead.y += dy;



    }
}