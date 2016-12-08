package CommandPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

/**
 * Created by lirandakrasniqi on 08/12/2016.
 */
public class SnakeAteFoodCommand implements Command {

    private GameCommands gameCommands;


    public SnakeAteFoodCommand(GameCommands gameCommand){

        this.gameCommands=gameCommand;
    }

    @Override
    public void execute() {
        gameCommands.snakeAteFruit();

    }


}
