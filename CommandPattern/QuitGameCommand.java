package CommandPattern;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class QuitGameCommand implements Command {

private GameCommands gameCommands;
    public QuitGameCommand(GameCommands gc){

        this.gameCommands=gc;
    }


    @Override
    public void execute() {
        gameCommands.gameOver();

    }
}
