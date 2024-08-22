package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Adding elements
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);

        // Displaying the HashMap
        System.out.println("Student Scores: " + studentScores);

        // Accessing values
        Integer aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // Checking if a key exists
        boolean hasCharlie = studentScores.containsKey("Charlie");
        System.out.println("Does Charlie exist? " + hasCharlie);

        // Checking if a value exists
        boolean hasScore78 = studentScores.containsValue(78);
        System.out.println("Is score 78 present? " + hasScore78);

        // Getting all keys
        Set<String> keys = studentScores.keySet();
        System.out.println("Keys: " + keys);

        // Getting all values
        Collection<Integer> scores = studentScores.values();
        System.out.println("Scores: " + scores);

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        System.out.println("After removing Bob: " + studentScores);

        // Size of the HashMap
        int size = studentScores.size();
        System.out.println("Size of the HashMap: " + size);

        // Clearing the HashMap
        studentScores.clear();
        System.out.println("HashMap after clearing: " + studentScores);

        // Checking if the HashMap is empty
        boolean isEmpty = studentScores.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}