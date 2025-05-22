import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDB {
    private List<User> users = new ArrayList<User>();
    private Scanner scanner = new Scanner(System.in);

    public UserDB() {
        User john = new User(1, "johndoe", "1234");
        users.add(john);
    }

    public void registerUser() {
        boolean isUserNameAvailable = false;
        String userName = "";
        while(!isUserNameAvailable) {
            System.out.println("Please enter username to register");
            String userNameInput = scanner.next();
            for(User user : users) {
                if(user.userName.equals(userNameInput)) {
                    System.err.println("user with this username already exists");
                    isUserNameAvailable = false;
                    break;
                }
                userName = userNameInput;
                isUserNameAvailable = true;
                System.out.println(isUserNameAvailable);
            }
        }
        System.out.println("Please enter password to register");
        String password = scanner.next();
        int id = this.users.isEmpty() ? 1 : users.getLast().id + 1;
        User newUser = new User(id, userName, password);
        this.users.add(newUser);
        System.out.println("registration is complete");
    }

    public User logIn() throws IllegalArgumentException {
        System.out.println("Please enter username to log in");
        String userName = scanner.next();
        System.out.println("Please enter password to log in");
        String password = scanner.next();
        for(User user : this.users) {
            if(user.userName.equals(userName)) {
                if(user.password.equals(password)) {
                    return user;
                }else {
                    throw new IllegalArgumentException("Wrong password");
                }
            }
        }

        throw new IllegalArgumentException("User with this userName doesn't exist");
    }
}
