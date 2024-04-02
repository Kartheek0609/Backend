package Project.TicTacToe.Service.WinningStrategy;

import Project.TicTacToe.Model.Board;
import Project.TicTacToe.Model.Cell;
import Project.TicTacToe.Model.Move;
import Project.TicTacToe.Model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{
    private int dimension;
    List<HashMap<Character,Integer>> colHashMapList;
    List<HashMap<Character,Integer>> rowHashMapList;
    HashMap<Character,Integer> rightDiagonal;
    HashMap<Character,Integer> leftDiagonal;
    HashMap<Character,Integer> cornerHashMap;

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.colHashMapList = new ArrayList<>();
        this.rowHashMapList = new ArrayList<>();
        this.rightDiagonal = new HashMap<>();
        this.leftDiagonal = new HashMap<>();
        this.cornerHashMap = new HashMap<>();
        for(int i=0;i<dimension;i++){
            colHashMapList.add(new HashMap<>());
            rowHashMapList.add(new HashMap<>());
        }
    }
    @Override
    public Player checkWinner(Board board, Move lastMove){
        Player player = lastMove.getPlayer();
        char symbol= player.getSymbol();;
        int row=lastMove.getCell().getRow();
        int col=lastMove.getCell().getRow();
        boolean winnerResult = winnerCheckForCorner(board.getMatrix(),symbol)
                || checkAndUpdateForColHashMap(col,symbol)
                || checkAndUpdateForRowHashMap(row,symbol)
                || (checkLeftDiagonal(row,col) && checkForLeftDiagonal(symbol))
                || (checkRightDiagonal(row,col) && checkForRightDiagonal(symbol));
        if(winnerResult){
            return player;
        }
        else{
            return null;
        }
    }

    private boolean checkLeftDiagonal(int row, int col){
        return row==col;
    }
    private boolean checkRightDiagonal(int row, int col){
        return (row+col)== (dimension-1);
    }
    private boolean checkAndUpdateForRowHashMap(int row,char symbol){
        HashMap<Character,Integer> rowHashMap= new HashMap<>();
        if(rowHashMap.containsKey(symbol)){
            int f=rowHashMap.get(symbol);
            rowHashMap.put(symbol,f+1);
            return rowHashMap.get(symbol)==dimension;
        }
        else{
            rowHashMap.put(symbol,1);
        }
        return false;
    }
    private boolean checkAndUpdateForColHashMap(int col,char symbol){
        HashMap<Character,Integer> colHashMap= new HashMap<>();
        if(colHashMap.containsKey(symbol)){
            int f=colHashMap.get(symbol);
            colHashMap.put(symbol,f+1);
            return colHashMap.get(symbol)==dimension;
        }
        else{
            colHashMap.put(symbol,1);
        }
        return false;
    }
    private boolean checkForLeftDiagonal(char symbol){
        if(leftDiagonal.containsKey(symbol)){
            int f=leftDiagonal.get(symbol);
            leftDiagonal.put(symbol,f+1);
            return leftDiagonal.get(symbol)==dimension;
        }
        else{
            leftDiagonal.put(symbol,1);
        }
        return false;
    }
    private boolean checkForRightDiagonal(char symbol){
        if(rightDiagonal.containsKey(symbol)){
            int f=rightDiagonal.get(symbol);
            rightDiagonal.put(symbol,f+1);
            return rightDiagonal.get(symbol)==dimension;
        }
        else{
            rightDiagonal.put(symbol,1);
        }
        return false;
    }
    private boolean winnerCheckForCorner(List<List<Cell>> matrix,char symbol){
        if(cornerHashMap.containsKey(symbol)){
            cornerHashMap.put(symbol, cornerHashMap.get(symbol)+1);
            return cornerHashMap.get(symbol) == 4;
        } else{
            cornerHashMap.put(symbol, 1);
        }
        return false;
    }
}
