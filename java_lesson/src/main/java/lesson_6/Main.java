package lesson_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class Main {
     public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("John", 2, 2, new ArrayList<>(List.of(4, 4, 3))));
        students.add(new Student("Alex", 1, 1, new ArrayList<>(List.of(2, 3, 2))));
        students.add(new Student("Maria", 1, 1, new ArrayList<>(List.of(5, 4, 5))));
        Student.printStudents(students, 1); 
        Student.expelStudent(students);
        Student.transferStudent(students);
        Student.printStudents(students, 2);
    }
}
