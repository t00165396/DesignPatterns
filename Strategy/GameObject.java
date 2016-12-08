package Strategy;
import java.awt.*;


public abstract class  GameObject {

    private ObjectPosition objectPosition;

    public ObjectPosition getObjectPosition() {
        return objectPosition;
    }

    protected void setLocation(ObjectPosition pos) {
        this.objectPosition = pos;
    }

    public void move(){
    }
    public void drawObject(Graphics g){}


}
