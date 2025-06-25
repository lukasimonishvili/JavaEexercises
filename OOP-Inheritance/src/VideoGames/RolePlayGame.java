package VideoGames;

public class RolePlayGame extends VideoGame{
    public final int storyLength;
    public RolePlayGame(String title, String developer, int price, int storyLength, int id) {
        super(title, developer, price, id, "role play");
        this.storyLength = storyLength;
    }
}
