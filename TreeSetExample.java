import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(70);
        marks.add(40);
        marks.add(90);
        marks.add(60);

        System.out.println("Sorted Set: " + marks);

        // first()
        System.out.println("First: " + marks.first());

        // last()
        System.out.println("Last: " + marks.last());

        // higher()
        System.out.println("Higher than 60: " + marks.higher(60));

        // lower()
        System.out.println("Lower than 60: " + marks.lower(60));

        // pollFirst()
        marks.pollFirst();

        System.out.println("After pollFirst: " + marks);
    }
}