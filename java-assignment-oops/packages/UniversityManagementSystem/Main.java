import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "Alice", "Computer Science");
        Student student2 = new Student("S002", "Bob", "Mechanical Engineering");

        // Create courses
        Course course1 = new Course("C101", "Data Structures", 3);
        Course course2 = new Course("C102", "Thermodynamics", 4);

        // Create faculty
        Faculty faculty1 = new Faculty("F001", "Dr. Smith", "Computer Science");
        Faculty faculty2 = new Faculty("F002", "Dr. Johnson", "Mechanical Engineering");

        // Display details
        System.out.println("Students:");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\nCourses:");
        System.out.println(course1);
        System.out.println(course2);

        System.out.println("\nFaculty:");
        System.out.println(faculty1);
        System.out.println(faculty2);
    }
}
