package VideoGames;

public class VideoGame {
    public final String title;
    public final String developer;
    public final int price;
    public final int id;
    public final String category;

    public VideoGame(String title, String developer, int price, int id, String category) {
        this.title = title;
        this.developer = developer;
        this.price = price;
        this.category = category;
        this.id = id;
    }

    public void getDescription() {
        System.out.println(this.title + " developed by " + this.developer + " category - " + this.category + " price - " + this.price);
    }
}
