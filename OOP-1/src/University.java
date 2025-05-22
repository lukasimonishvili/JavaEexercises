import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void bestStudent() {
        Student best = this.students.getFirst();
        for(int i = 1; i < students.size(); i++) {
            Student temp = this.students.get(i);
            if(temp.getAverageGrade() > best.getAverageGrade()) {
                best = temp;
            }
        }

        System.out.println("Best student is " + best.name + " with average grade " + best.getAverageGrade());
    }
}