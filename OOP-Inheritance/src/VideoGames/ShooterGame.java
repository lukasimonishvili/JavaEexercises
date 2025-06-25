package VideoGames;

public class ShooterGame extends VideoGame{
    public final boolean hasMultiplayer;
    public ShooterGame(String title, String developer, int price, boolean hasMultiplayer, int id) {
        super(title, developer, price, id, "shooter");
        this.hasMultiplayer = hasMultiplayer;
    }
}
