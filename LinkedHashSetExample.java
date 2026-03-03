import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Insertion Order Maintained:");
        numbers.forEach(System.out::println);

        // removeIf()
        numbers.removeIf(n -> n < 15);

        System.out.println("After removeIf:");
        numbers.forEach(System.out::println);
    }
}