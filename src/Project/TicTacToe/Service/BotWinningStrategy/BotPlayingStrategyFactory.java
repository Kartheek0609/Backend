package Project.TicTacToe.Service.BotWinningStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingStrategy();
    }
}
