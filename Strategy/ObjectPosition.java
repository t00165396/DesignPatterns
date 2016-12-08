package Strategy;

import java.awt.*;

/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public  class ObjectPosition {
    private int dx;
    private int dy;

    private Point position;

    /**
     * Empty constructor
     */
    public ObjectPosition() {

}


    public ObjectPosition (int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }


    protected void setDx(int dx) {
        this.dx = dx;
    }


    protected void setDy(int dy) {
        this.dy = dy;
    }


    protected int getDx() {
        return dx;
    }

    protected int getDy() {
        return dy;
    }

    public void setObjectPosition(int dx, int dy){

        position=new Point(dx,dy);
    }

    public Point getObjectPosition(){

        return position;
    }

}
