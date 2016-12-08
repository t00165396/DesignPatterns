package CommandPattern;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class testCommand {

    public static void main(String[] args)    {
        InvokeCommands control = new InvokeCommands();
        GameCommands g = new GameCommands();
        QuitGameCommand quitGameCommand = new QuitGameCommand(g);

        control.setCommand(quitGameCommand);
        control.pressButton();

    }
}
