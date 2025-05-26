package School;

public class Teacher extends Person{
    public final String major;

    public Teacher(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
}
