import java.util.*;

/**
 * =========================================================
 * Assignment-16: Collections Framework
 * =========================================================
 *
 * Topics Covered:
 * 1. ArrayList Operations
 * 2. HashMap Operations
 * 3. HashSet Operations
 *
 */

public class CollectionsAssignment {

    public static void main(String[] args) {

        // =================================================
        // 1. ARRAYLIST OPERATIONS
        // =================================================

        System.out.println("===== 1. ArrayList Operations =====");

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("SQL");
        languages.add("Spring");
        languages.add("Hibernate");

        System.out.println("Original ArrayList:");
        System.out.println(languages);

        // Add an element
        languages.add("React");

        // Iterate using Iterator
        System.out.println("\nIterating using Iterator:");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        // Add element at specific index
        languages.add(2, "Angular");

        // Remove element by value
        languages.remove("HTML");

        // Remove element by index
        languages.remove(0);

        // Update element
        languages.set(1, "Advanced Python");

        // Check element at index
        System.out.println(
                "\nElement at Index 3: "
                        + languages.get(3));

        // Get element at index
        System.out.println(
                "Element at Index 2: "
                        + languages.get(2));

        // Size
        System.out.println(
                "Size of ArrayList: "
                        + languages.size());

        // Contains
        System.out.println(
                "Contains SQL? "
                        + languages.contains("SQL"));

        System.out.println(
                "\nUpdated ArrayList:");

        System.out.println(languages);

        // Remove all elements
        ArrayList<String> tempList = new ArrayList<>(languages);

        tempList.clear();

        System.out.println(
                "\nAfter clear(): "
                        + tempList);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 2. HASHMAP OPERATIONS
        // =================================================

        System.out.println(
                "===== 2. HashMap Operations =====");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Emma");
        students.put(106, "Frank");
        students.put(107, "Grace");
        students.put(108, "Henry");
        students.put(109, "Isabella");
        students.put(110, "Jack");

        System.out.println(
                "Original HashMap:");

        System.out.println(students);

        // Insert new key-value pair
        students.put(111, "Kevin");

        // Fetch value
        System.out.println(
                "\nStudent ID 103 : "
                        + students.get(103));

        // Clone HashMap
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) students.clone();

        System.out.println(
                "\nCloned Map:");

        System.out.println(cloneMap);

        // Contains Key
        System.out.println(
                "\nContains Key 105 ? "
                        + students.containsKey(105));

        // Contains Value
        System.out.println(
                "Contains Value Emma ? "
                        + students.containsValue("Emma"));

        // Is Empty
        System.out.println(
                "Is Map Empty ? "
                        + students.isEmpty());

        // Size
        System.out.println(
                "Map Size : "
                        + students.size());

        // Print Keys
        System.out.println(
                "\nKeys:");

        System.out.println(
                students.keySet());

        // Print Values
        System.out.println(
                "\nValues:");

        System.out.println(
                students.values());

        // Remove specific key-value pair
        students.remove(102);

        System.out.println(
                "\nAfter Removing Key 102:");

        System.out.println(students);

        // Copy Map
        HashMap<Integer, String> copiedMap = new HashMap<>();

        copiedMap.putAll(students);

        System.out.println(
                "\nCopied Map:");

        System.out.println(copiedMap);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 3. HASHSET OPERATIONS
        // =================================================

        System.out.println(
                "===== 3. HashSet Operations =====");

        HashSet<String> technologies = new HashSet<>();

        technologies.add("Java");
        technologies.add("Python");
        technologies.add("C");
        technologies.add("C++");
        technologies.add("JavaScript");
        technologies.add("Spring");
        technologies.add("Hibernate");
        technologies.add("React");
        technologies.add("Angular");
        technologies.add("SQL");

        System.out.println(
                "Original HashSet:");

        System.out.println(technologies);

        // Add Duplicate
        technologies.add("Java");

        System.out.println(
                "\nAfter Adding Duplicate:");

        System.out.println(technologies);

        // Contains
        System.out.println(
                "\nContains Python ? "
                        + technologies.contains("Python"));

        // Remove Element
        technologies.remove("Angular");

        System.out.println(
                "\nAfter Removing Angular:");

        System.out.println(technologies);

        // Size
        System.out.println(
                "\nHashSet Size : "
                        + technologies.size());

        // Iterate
        System.out.println(
                "\nIterating HashSet:");

        for (String tech : technologies) {

            System.out.println(tech);
        }

        // Is Empty
        System.out.println(
                "\nIs HashSet Empty ? "
                        + technologies.isEmpty());

        // Clone HashSet
        HashSet<String> clonedSet = (HashSet<String>) technologies.clone();

        System.out.println(
                "\nCloned HashSet:");

        System.out.println(clonedSet);

        // Clear HashSet
        HashSet<String> tempSet = new HashSet<>(technologies);

        tempSet.clear();

        System.out.println(
                "\nAfter clear(): "
                        + tempSet);

        System.out.println(
                "\n===================================\n");

        System.out.println(
                "Collections Assignment Completed Successfully.");
    }
}
