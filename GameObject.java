/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public abstract class  GameObject {

    private ObjectPosition objectPosition;

//need to draw objects here
    //position of object


    public ObjectPosition getObjectPosition() {
        return objectPosition;
    }

    protected void setLocation(ObjectPosition pos) {
        this.objectPosition = pos;
    }

    public void move(){



    }


}
