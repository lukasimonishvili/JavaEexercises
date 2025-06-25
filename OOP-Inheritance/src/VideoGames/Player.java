package VideoGames;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public final String name;
    public final int age;
    public final String userName;
    public final String password;
    public List<PlayerGame> ownedGames = new ArrayList<>();
    public final int id;

    public Player(String name, int age, String userName, String password, int id) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public void addGame(VideoGame game) {
        this.ownedGames.add(new PlayerGame(game));
    }
}
