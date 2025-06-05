package lesson_6.lesson_6_ex_1;
import java.util.ArrayList;
import java.util.Set;

public class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> grade;
    
    public Student(String name, int group, int course, ArrayList<Integer> grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = new ArrayList<>(grade);
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }
    
    private int getAverageGrade() {
        if (grade.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int g : grade) {
            sum += g;
        }
        return sum / grade.size();
    }

    public static void expelStudent(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void transferStudent(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.course++;
            }
        }
    }
    
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
   
}
