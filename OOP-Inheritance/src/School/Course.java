package School;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void displatParticipants() {
        System.out.println("Teacher - " + this.teacher.name + " age of " + this.teacher.age + " and with major " + this.teacher.major);
        System.out.println("Student list:");
        for(int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            System.out.println((i+1) + ") " + student.name + " age of " + student.age +" with grade - " + student.grade);
        }
    }
}
