package CommandPattern;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class SnakeHitWallCommand implements Command {
    private GameCommands gameCommands;

    public SnakeHitWallCommand(GameCommands gameCommand){

        this.gameCommands=gameCommand;
    }
    @Override
    public void execute() {
        gameCommands.snakeHitWall();

    }
}
