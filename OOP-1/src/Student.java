import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Double> grades = new ArrayList<Double>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(Double grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        double gradeToPass = 5.0;
        double result = 0;
        for(double grade : this.grades) {
            result += grade;
        }

        result = result / this.grades.size();
        String status = result >= gradeToPass ? "passed" : "failed";
        System.out.println("Average grade of " + this.name + " is " + result + ". minimum average grade to pass is" + gradeToPass + " Student " + status);
        return result;
    }
}
