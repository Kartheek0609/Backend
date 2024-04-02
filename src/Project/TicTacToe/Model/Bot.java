package Project.TicTacToe.Model;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, PlayerType playerType, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "Panther", playerType.BOT, '$');
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
