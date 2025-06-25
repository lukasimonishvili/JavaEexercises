package VideoGames;

public class PuzzeGame extends VideoGame{
    public final int levels;
    public PuzzeGame(String title, String developer, int price, int levels, int id) {
        super(title, developer, price, id, "puzzle");
        this.levels = levels;
    }
}
