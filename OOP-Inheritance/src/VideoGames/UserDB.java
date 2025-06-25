package VideoGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDB {
    private Scanner scanner = new Scanner(System.in);
    public List<Player> users = new ArrayList<>();
    public Player logedInPlayer;

    public void registerUser(){
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Please enter your username");
        String username = scanner.next();
        System.out.println("please enter your password");
        String password = scanner.next();
        int id = users.isEmpty() ? 1 : users.getLast().id + 1;
        users.add(new Player(name, age, username, password, id));
        System.out.println("Registration went successfully");
    }

    public boolean logIn() {
        System.out.println("Please enter userName");
        String userName = scanner.next();
        System.out.println("Please enter password");
        String password = scanner.next();
        for(Player player : users) {
            if(userName.equals(player.userName)){
                if(password.equals(player.password)){
                    this.logedInPlayer = player;
                    return true;
                }
                break;
            }
        }
        System.out.println("wrong username or password");
        return false;
    }

    public void logOut() {
        this.logedInPlayer = null;
    }
}
