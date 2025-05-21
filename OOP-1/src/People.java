import java.util.ArrayList;
import java.util.List;

public class People {
    public void logPeople() {
        List<Person> people = new ArrayList<Person>();
        try {
            Person john = new Person("John", "johndoe@gmail.com", 19);
            people.add(john);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Person lolita = new Person("Lolita", "lolitasanchezgmail.com", 22);
            people.add(lolita);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Person gabriel = new Person("Gabriel", "gabrielmorzalez@gmail.com", 15);
            people.add(gabriel);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        for(Person person : people) {
            System.out.println(person.toString());
        }
    }
}
