package ConstructorsAssignment;

/**
 * =========================================================
 * Assignment-12: Constructors
 * =========================================================
 */

public class MainClass {

    public static void main(String[] args) {

        // =================================================
        // Question 1
        // =================================================

        System.out.println(
                "===== Question 1 =====");

        ConstructorDemo obj1 = new ConstructorDemo();

        ConstructorDemo obj2 = new ConstructorDemo("Alice");

        ConstructorDemo obj3 = new ConstructorDemo(
                "Bob",
                25);

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 2
        // =================================================

        System.out.println(
                "===== Question 2 =====");

        Child child1 = new Child();

        System.out.println();

        Child child2 = new Child(
                "Hello Parent");

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 3
        // =================================================

        System.out.println(
                "===== Question 3 =====");

        new AccessModifierConstructors();

        new AccessModifierConstructors(101);

        new AccessModifierConstructors("David");

        AccessModifierConstructors
                .createPrivateObject();

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 4
        // =================================================

        /*
         * Invalid Java Question
         *
         * Constructors CANNOT have
         * return types.
         *
         * The following is NOT a constructor:
         *
         * public int Employee()
         *
         * It becomes a normal method.
         */

        System.out.println(
                "===== Question 4 =====");

        System.out.println(
                "Constructors cannot have return types.");

        System.out.println(
                "int ConstructorName() and "
                        + "String ConstructorName() "
                        + "are methods, not constructors.");

        System.out.println(
                "\n===================================\n");

        // =================================================
        // Question 5
        // =================================================

        System.out.println(
                "===== Question 5 =====");

        ConstructorDemo employee = new ConstructorDemo();

        /*
         * Constructors cannot be called
         * again using an existing object.
         *
         * employee.ConstructorDemo();
         *
         * This is invalid Java.
         */

        System.out.println(
                "A constructor executes only during object creation.");

        System.out.println(
                "To execute it again, create a new object.");

        employee = new ConstructorDemo();

        System.out.println(
                "\n===================================\n");
    }
}


package ConstructorsAssignment;

/**
 * =========================================================
 * Parent Class
 * =========================================================
 */

public class Parent {

    public Parent() {

        System.out.println(
                "Parent Default Constructor");
    }

    public Parent(String message) {

        System.out.println(
                "Parent Parameterized Constructor");

        System.out.println(
                "Message: " + message);
    }
}package ConstructorsAssignment;

/**
 * =========================================================
 * Question 2
 * Calling Parent Constructors
 * =========================================================
 */

public class Child extends Parent {

    public Child() {

        super();

        System.out.println(
                "Child Default Constructor");
    }

    public Child(String message) {

        super(message);

        System.out.println(
                "Child Parameterized Constructor");
    }
}


package ConstructorsAssignment;

/**
 * =========================================================
 * Question 3
 * Constructors with Different Access Modifiers
 * =========================================================
 */

public class AccessModifierConstructors {

    // Public Constructor
    public AccessModifierConstructors() {

        System.out.println(
                "Public Constructor");
    }

    // Protected Constructor
    protected AccessModifierConstructors(int id) {

        System.out.println(
                "Protected Constructor");

        System.out.println(
                "ID: " + id);
    }

    // Default Constructor
    AccessModifierConstructors(String name) {

        System.out.println(
                "Default Constructor");

        System.out.println(
                "Name: " + name);
    }

    // Private Constructor
    private AccessModifierConstructors(
            String name,
            int age) {

        System.out.println(
                "Private Constructor");

        System.out.println(
                "Name: " + name);

        System.out.println(
                "Age: " + age);
    }

    public static void createPrivateObject() {

        AccessModifierConstructors obj = new AccessModifierConstructors(
                "John",
                25);
    }
}


package ConstructorsAssignment;

/**
 * =========================================================
 * Question 1
 * Default, One-Argument and Two-Argument Constructors
 * =========================================================
 */

public class ConstructorDemo {

    public ConstructorDemo() {

        System.out.println(
                "Default Constructor Called");
    }

    public ConstructorDemo(String name) {

        System.out.println(
                "One Argument Constructor Called");

        System.out.println(
                "Name: " + name);
    }

    public ConstructorDemo(String name, int age) {

        System.out.println(
                "Two Argument Constructor Called");

        System.out.println(
                "Name: " + name);

        System.out.println(
                "Age: " + age);
    }
}
