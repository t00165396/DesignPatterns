import java.awt.*;
import java.util.LinkedList;



/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public class snake {

    private LinkedList<Point> snake;//a linkedList with point objects
    private Point snakesHead;
    private Point snakesTail;

    public snake(){

        snake.addFirst(new Point(20,20));//  Returns the first element in this list.in this case it would be thehead of the snakeGame
    }

    public Point getSnakesHead(){
        return  snake.getFirst();
    }

    public Point getSnakesTail(){
        return  snake.getLast();//

    }



    public void drawSnake(Graphics g) {
        for (int i = 0; i < snake.size(); i++) {
            g.setColor(Color.GREEN);
            Point p = snake.get(i);
            g.fillOval(p.x * 15, p.y * 15, 15, 15);
        }
    }

    public void moveSnake(int dx, int dy) {
        for (int i = snake.size() - 1; i >= 1; i--) {
            snake.get(i).setLocation(snake.get(i - 1));
        }
        snakesHead.x += dx;
        snakesHead.y += dy;
    }


    public void growSnake(int n) {
        while (n > 0) {

            snake.add(new Point(snakesTail));
            n--;
        }
    }
}