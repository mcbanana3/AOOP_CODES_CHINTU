package mapinterface;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();

        // Adding elements
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);

        // Displaying the LinkedHashMap
        System.out.println("Student Scores: " + studentScores);

        // Accessing values
        Integer aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // Checking if a key exists
        boolean hasCharlie = studentScores.containsKey("Charlie");
        System.out.println("Does Charlie exist? " + hasCharlie);

        // Getting all keys
        Set<String> keys = studentScores.keySet();
        System.out.println("Keys: " + keys);

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        // Size of the LinkedHashMap
        int size = studentScores.size();
        System.out.println("Size of the LinkedHashMap: " + size);

        // Removing an element
        studentScores.remove("Bob");
        System.out.println("After removing Bob: " + studentScores);

        // Clearing the LinkedHashMap
        studentScores.clear();
        System.out.println("LinkedHashMap after clearing: " + studentScores);

        // Checking if the LinkedHashMap is empty
        boolean isEmpty = studentScores.isEmpty();
        System.out.println("Is LinkedHashMap empty? " + isEmpty);
    }
}
