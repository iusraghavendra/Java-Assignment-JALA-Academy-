/**
 * =========================================================
 * Assignment-13: Method Overloading
 * =========================================================
 *
 * Topics Covered:
 * 1. Same Method Name, Different Number of Parameters
 * 2. Same Method Name, Different Number of Parameters
 * with Different Data Types
 * 3. Same Method Name, Same Parameters, Same Data Type
 * 4. Same Method Name, Same Number of Parameters,
 * Different Data Types
 * 5. Same Method Name, Same Parameters,
 * Different Return Types
 *
 */

public class MethodOverloadingAssignment {

    // =====================================================
    // Question 1
    // Same Name, Different Number of Parameters
    // =====================================================

    public void display(int number) {

        System.out.println(
                "One Integer Parameter: " + number);
    }

    public void display(int number1, int number2) {

        System.out.println(
                "Two Integer Parameters: "
                        + number1 + ", " + number2);
    }

    // =====================================================
    // Question 2
    // Same Name, Different Number of Parameters
    // Different Data Types
    // =====================================================

    public void printData(String name) {

        System.out.println(
                "Name: " + name);
    }

    public void printData(String name, int age) {

        System.out.println(
                "Name: " + name
                        + ", Age: " + age);
    }

    // =====================================================
    // Question 4
    // Same Number of Parameters
    // Different Data Types
    // =====================================================

    public void calculate(int number) {

        System.out.println(
                "Integer Value: " + number);
    }

    public void calculate(double number) {

        System.out.println(
                "Double Value: " + number);
    }

    public static void main(String[] args) {

        MethodOverloadingAssignment obj = new MethodOverloadingAssignment();

        // =================================================
        // Question 1
        // =================================================

        System.out.println(
                "===== Question 1 =====");

        obj.display(10);

        obj.display(10, 20);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 2
        // =================================================

        System.out.println(
                "===== Question 2 =====");

        obj.printData("Alice");

        obj.printData("Bob", 25);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 3
        // =================================================

        /*
         * INVALID JAVA
         *
         * Same method name
         * Same number of parameters
         * Same parameter data types
         *
         * is NOT method overloading.
         */

        System.out.println(
                "===== Question 3 =====");

        System.out.println(
                "Not possible in Java.");

        System.out.println(
                "Methods with identical signatures"
                        + " cause compilation errors.");

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 4
        // =================================================

        System.out.println(
                "===== Question 4 =====");

        obj.calculate(100);

        obj.calculate(99.99);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 5
        // =================================================

        /*
         * INVALID JAVA
         *
         * Return type alone cannot
         * distinguish overloaded methods.
         */

        System.out.println(
                "===== Question 5 =====");

        System.out.println(
                "Not possible in Java.");

        System.out.println(
                "Methods differing only by"
                        + " return type cause"
                        + " compilation errors.");

        System.out.println(
                "\n===================================\n");
    }
}
