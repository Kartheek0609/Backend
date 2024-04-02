package Project.TicTacToe.Service.WinningStrategy;

import Project.TicTacToe.Model.Board;
import Project.TicTacToe.Model.Move;
import Project.TicTacToe.Model.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move LastMove);
}
