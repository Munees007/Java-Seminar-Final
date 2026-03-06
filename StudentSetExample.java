import java.util.HashSet;
import java.util.Set;

class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

public class StudentSetExample {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Munees"));
        students.add(new Student(2, "Arun"));
        students.add(new Student(3, "Kumar"));

        System.out.println("Students in HashSet:");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Total Students: " + students.size());
    }
}
