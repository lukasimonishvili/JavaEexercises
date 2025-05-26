package School;

public class School {
    private final Teacher teacher = new Teacher("John Doe", 44, "bachelor");
    private final Student student1 = new Student("Abraham Lincoln", 18, 5);
    private final Student student2 = new Student("Sasha Gray", 22, 4);
    private final Student student3 = new Student("Volodimir Zelensky", 27, 3);
    private final Student student4 = new Student("Bruce Lee", 25, 5);
    private final Course course = new Course();

    public School() {
        this.course.assignTeacher(teacher);
        this.course.addStudent(student1);
        this.course.addStudent(student2);
        this.course.addStudent(student3);
        this.course.addStudent(student4);
    }

    public void displaySchoolMembers() {
        this.course.displatParticipants();
    }

}
