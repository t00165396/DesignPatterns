package CommandPattern;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class SnakeHitItselfCommand implements Command{
    private GameCommands gameCommands;

    public SnakeHitItselfCommand(GameCommands gameCommand){

        this.gameCommands=gameCommand;
    }
    @Override
    public void execute() {
        gameCommands.snakeHitItself();

    }
}
