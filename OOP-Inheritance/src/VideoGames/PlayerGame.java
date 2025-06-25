package VideoGames;

public class PlayerGame {
    public final VideoGame game;
    public int hoursSpent = 0;

    public PlayerGame(VideoGame game) {
        this.game = game;
    }

    public void increaseHours(int hours) {
        this.hoursSpent += hours;
    }
}
