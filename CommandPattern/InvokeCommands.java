package CommandPattern;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class InvokeCommands {

    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();

    }
}
