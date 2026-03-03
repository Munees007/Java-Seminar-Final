import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        // add()
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate

        // size()
        System.out.println("Size: " + fruits.size());

        // contains()
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // remove()
        fruits.remove("Banana");

        // forEach()
        System.out.println("Using forEach:");
        fruits.forEach(f -> System.out.println(f));

        // iterator()
        System.out.println("Using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // equals()
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Mango");

        System.out.println("Sets Equal? " + fruits.equals(anotherSet));

        // isEmpty()
        System.out.println("Is Empty? " + fruits.isEmpty());

        // clear()
        fruits.clear();
        System.out.println("After clear size: " + fruits.size());
    }
}