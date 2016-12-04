package Strategy;
import java.awt.*;

/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public abstract class MoveObject extends GameObject {
    //need to set the speed etc.

    public abstract void move ();

    public abstract void drawObject(Graphics g);
}

