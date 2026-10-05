/**
 * =========================================================
 * Assignment-1: JAVA Basics
 * =========================================================
 *
 * Topics Covered:
 * 1. Class, Object, Method and Method Signature
 * 2. Print Your Name
 * 3. Single-line, Multi-line and Documentation Comments
 * 4. Primitive Data Types
 * 5. Local and Global Variables
 * 6. Function Call from Main Method
 *
 */

public class JavaBasicsAssignment {

    // =====================================================
    // Global Variable (Instance Variable)
    // =====================================================
    String name = "Global Variable";

    // =====================================================
    // 6. Method to Print Name
    // Method Signature: public void printName()
    // =====================================================
    public void printName() {
        System.out.println("My Name is John Doe");
    }

    // =====================================================
    // 5. Local vs Global Variables
    // =====================================================
    public void variableScopeDemo() {

        // Local Variable with same name as global variable
        String name = "Local Variable";

        System.out.println("Local Variable: " + name);

        // Accessing global variable using 'this'
        System.out.println("Global Variable: " + this.name);
    }

    public static void main(String[] args) {

        // =================================================
        // 1. Creating Class Object and Calling Methods
        // =================================================

        JavaBasicsAssignment obj = new JavaBasicsAssignment();

        System.out.println("===== Class, Object and Method Demo =====");

        obj.printName();

        System.out.println();

        // =================================================
        // 2. Print Your Name
        // =================================================

        System.out.println("===== Print Name =====");

        System.out.println("My Name is John Doe");

        System.out.println();

        // =================================================
        // 3. Comments in Java
        // =================================================

        System.out.println("===== Comments in Java =====");

        // Single-line comment

        /*
         * Multi-line comment
         * This can span multiple lines.
         */

        /**
         * Documentation Comment (JavaDoc)
         * Used to generate API documentation.
         */

        System.out.println("Comments help explain the code.");

        System.out.println();

        // =================================================
        // 4. Primitive Data Types
        // =================================================

        System.out.println("===== Data Types =====");

        int integerValue = 100;
        boolean booleanValue = true;
        char characterValue = 'A';
        float floatValue = 12.5f;
        double doubleValue = 99.99;

        System.out.println("Integer Value : " + integerValue);
        System.out.println("Boolean Value : " + booleanValue);
        System.out.println("Character Value : " + characterValue);
        System.out.println("Float Value : " + floatValue);
        System.out.println("Double Value : " + doubleValue);

        System.out.println();

        // =================================================
        // 5. Local and Global Variables
        // =================================================

        System.out.println("===== Local vs Global Variables =====");

        obj.variableScopeDemo();

        System.out.println();

        // =================================================
        // 6. Function Call from Main Method
        // =================================================

        System.out.println("===== Method Call Demo =====");

        obj.printName();
    }
}