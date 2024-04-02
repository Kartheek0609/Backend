package Project.TicTacToe.Service.BotWinningStrategy;

import Project.TicTacToe.Model.Board;
import Project.TicTacToe.Model.Move;
import Project.TicTacToe.Model.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
