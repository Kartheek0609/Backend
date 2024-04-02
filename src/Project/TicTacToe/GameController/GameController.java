package Project.TicTacToe.GameController;

import Project.TicTacToe.Model.Game;
import Project.TicTacToe.Model.GameStatus;
import Project.TicTacToe.Model.Move;
import Project.TicTacToe.Model.Player;
import Project.TicTacToe.Service.WinningStrategy.WinningStrategyFactory;
import Project.TicTacToe.Service.WinningStrategy.WinningStrategyName;

import java.util.List;

public class GameController{
    public Game createGame(int dimension, List<Player> players, WinningStrategyName winningStrategyName){
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(dimension))
                .build();
    }
    public void displayBoard(Game game){
        game.getCurrentBoard().displayBoard();
    }
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }
    public Move executeMove(Game game,Player player){
        return player.makeMove(game.getCurrentBoard());
    }
    public Player checkWinner(Game game, Move lastMove){
        return game.getWinningStrategy().checkWinner(game.getCurrentBoard(),lastMove);
    }
}
