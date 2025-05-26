package School;

public class Student extends Person{
    public final int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
}
