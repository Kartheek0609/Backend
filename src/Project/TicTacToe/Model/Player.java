package Project.TicTacToe.Model;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private PlayerType playerType;
    private char Symbol;

    public Player() {
    }

    public Player(int id, String name, PlayerType playerType, char symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        Symbol = symbol;
    }
    public Move makeMove(Board board){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row for the targeted Cell");
        int row =scn.nextInt();
        System.out.println("Enter the col for the targeted Cell");
        int col =scn.nextInt();
        Cell playedMovedCell = board.getMatrix().get(row).get(col);
        playedMovedCell.setCellState(CellState.FILLED);
        playedMovedCell.setPlayer(this);
        return new Move(playedMovedCell,this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public char getSymbol() {
        return Symbol;
    }

    public void setSymbol(char symbol) {
        Symbol = symbol;
    }
}
