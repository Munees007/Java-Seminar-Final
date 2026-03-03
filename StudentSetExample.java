import java.util.*;

class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // equals() for checking duplicates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student s = (Student) obj;
        return this.rollNo == s.rollNo;
    }

    // hashCode() for HashSet
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}

public class StudentSetExample {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Munees", 85));
        students.add(new Student(2, "Arun", 70));
        students.add(new Student(1, "Duplicate", 90)); // Duplicate rollNo

        System.out.println("Students:");
        students.forEach(System.out::println);

        // contains()
        System.out.println("Contains roll 1? " +
            students.contains(new Student(1, "Test", 50)));

        // remove()
        students.remove(new Student(2, "Arun", 70));

        System.out.println("After remove:");
        students.forEach(System.out::println);
    }
}