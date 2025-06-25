package VideoGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamingPaltform {
    private List<VideoGame> allGames = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private UserDB userDB = new UserDB();

    private void addVideoGame() {
        int id = allGames.isEmpty() ? 1 : allGames.getLast().id + 1;
        System.out.println("please enter name of the game");
        String gameName = scanner.nextLine();
        System.out.println("please type game developer");
        String gameDeveloper = scanner.nextLine();
        System.out.println("please type game price");
        int gamePrice = scanner.nextInt();
        System.out.println("please select category");
        System.out.println("1) role play");
        System.out.println("2) shooter");
        System.out.println("3) puzzle");
        int category = scanner.nextInt();
        switch (category) {
            case 1:
                System.out.println("please type estimated storyline length");
                int storyLength = scanner.nextInt();
                this.allGames.add(new RolePlayGame(gameName, gameDeveloper, gamePrice, storyLength, id));
            break;
            case 2:
                System.out.println("Does your game has multiplayer? yes/no");
                String hasMultiplayerAnswer = scanner.next();
                boolean hasMultiplayer = hasMultiplayerAnswer.equals("yes");
                this.allGames.add(new ShooterGame(gameName, gameDeveloper, gamePrice, hasMultiplayer, id));
            break;
            case 3:
                System.out.println("How many levels your game will have?");
                int levels = scanner.nextInt();
                this.allGames.add(new PuzzeGame(gameName, gameDeveloper, gamePrice, levels, id));
            break;
        }
        System.out.println("your game has created");
        this.startPlatform();
    }

    private void seeGameCatalog() {
        for(VideoGame game : allGames) {
            game.getDescription();
        }
        this.startPlatform();
    }

    private void buyGame() {

    }

    public void startPlatform() {
        System.out.println("Please choose your action");
        System.out.println("1) create new game");
        System.out.println("2) See game catalog");
        System.out.println("3) register");
        System.out.println("4) log in");
        System.out.println("5) exit");

        int actionInput = scanner.nextInt();

        switch (actionInput) {
            case 1:
                this.addVideoGame();
            break;
            case 2:
                this.seeGameCatalog();
            break;
            case 3:
                userDB.registerUser();
                this.startPlatform();
            break;
            case 4:
                boolean login = userDB.logIn();
                if(login) {
                    this.logedInMenu();
                }else {
                    this.startPlatform();
                }
            break;
        }
    }

    public void logedInMenu() {
        System.out.println("Please choose your action");
        System.out.println("1) create new game");
        System.out.println("2) See game catalog");
        System.out.println("3) buy game");
        System.out.println("4) play game");
        System.out.println("5) see leaderboards");
        System.out.println("6) log out");
        System.out.println("7) see leaderboards");

        int actionInput = scanner.nextInt();
        switch (actionInput) {
            case 1:
                this.addVideoGame();
                break;
            case 2:
                this.seeGameCatalog();
                break;
            case 3:
                userDB.registerUser();
                this.startPlatform();
                break;
            case 4:
                boolean login = userDB.logIn();
                if(login) {
                    this.logedInMenu();
                }else {
                    this.startPlatform();
                }
                break;
        }
    }
}
