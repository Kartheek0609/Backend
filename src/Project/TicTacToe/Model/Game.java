package Project.TicTacToe.Model;
import Project.TicTacToe.Exception.InvalidBotException;
import Project.TicTacToe.Exception.InvalidPlayerSizeException;
import Project.TicTacToe.Exception.InvalidSymbolException;
import Project.TicTacToe.Service.WinningStrategy.WinningStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Game {
    private Board currentBoard;
    private List<Player> players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinningStrategy winningStrategy;
    private int noOfSymbols;
    public Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.players = players;
        this.currentPlayer = null;
        this.gameStatus = gameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.boardStates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
        this.noOfSymbols = players.size();
    }
    public static Builder builder(){
        return new Builder();
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }
    public static class Builder{
        private int dimension;
        private Board currentBoard;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setCurrentBoard(Board currentBoard) {
            this.currentBoard = currentBoard;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }
        private void validateNoOfPlayers(){
            if(players.size() < dimension-2 || players.size() >= dimension){
                throw new InvalidPlayerSizeException("Player size should less than dimension -2 or dimension -1 as per the board dimension");
            }
        }
        private void validateBotCount(){
            int botCount=0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount>1 || botCount<0){
                throw new InvalidBotException("Only one bot should allowed per board");
            }
        }
        private void validateSymbols(){
            HashSet<Character> symbols = new HashSet<>();
            for(Player player : players){
                symbols.add(player.getSymbol());
            }
            if(symbols.size() != players.size()){
                throw new InvalidSymbolException("Each player has a Unique Symbol");
            }
        }
        public void validate(){
            validateSymbols();
            validateBotCount();
            validateNoOfPlayers();
        }
        public Game build(){
            validate();
            return new Game(new Board(dimension),players,winningStrategy);
        }

    }
}
