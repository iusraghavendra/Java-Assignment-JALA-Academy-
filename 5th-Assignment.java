/**
 * =========================================================
 * Assignment-5: Static in Java
 * =========================================================
 *
 * Topics Covered:
 * 1. Static Variables and Instance Variables
 * 2. Print Instance Variables in Static Methods
 * 3. Print Static Variables in Instance Methods
 * 4. Call Instance Methods in Static Methods
 * 5. Call Static Methods in Instance Methods
 * 6. Print All Variables in Main Method
 * 7. Call Static and Instance Methods in Main Method
 *
 */

public class StaticAssignment {

    // =====================================================
    // Static Variables
    // =====================================================

    static String companyName = "Bright IT";
    static String location = "Hyderabad";

    // =====================================================
    // Instance Variables
    // =====================================================

    String employeeName = "John";
    int employeeId = 101;

    // =====================================================
    // Static Method 1
    // =====================================================

    public static void staticMethodOne() {

        System.out.println("Inside Static Method One");

        // Printing instance variables using object
        StaticAssignment obj = new StaticAssignment();

        System.out.println("Employee Name : " + obj.employeeName);
        System.out.println("Employee ID   : " + obj.employeeId);

        // Calling instance method from static method
        obj.instanceMethodOne();
    }

    // =====================================================
    // Static Method 2
    // =====================================================

    public static void staticMethodTwo() {

        System.out.println("Inside Static Method Two");

        StaticAssignment obj = new StaticAssignment();

        System.out.println("Employee Name : " + obj.employeeName);
        System.out.println("Employee ID   : " + obj.employeeId);

        // Calling instance method
        obj.instanceMethodTwo();
    }

    // =====================================================
    // Instance Method 1
    // =====================================================

    public void instanceMethodOne() {

        System.out.println("Inside Instance Method One");

        // Printing static variables
        System.out.println("Company Name : " + companyName);
        System.out.println("Location     : " + location);

        // Calling static method
        staticMethodTwo();
    }

    // =====================================================
    // Instance Method 2
    // =====================================================

    public void instanceMethodTwo() {

        System.out.println("Inside Instance Method Two");

        // Printing static variables
        System.out.println("Company Name : " + companyName);
        System.out.println("Location     : " + location);
    }

    // =====================================================
    // Main Method
    // =====================================================

    public static void main(String[] args) {

        StaticAssignment obj = new StaticAssignment();

        // =================================================
        // 6. Print All Static and Instance Variables
        // =================================================

        System.out.println("===== Static Variables =====");

        System.out.println("Company Name : " + companyName);
        System.out.println("Location     : " + location);

        System.out.println("\n===== Instance Variables =====");

        System.out.println("Employee Name : " + obj.employeeName);
        System.out.println("Employee ID   : " + obj.employeeId);

        System.out.println("\n===================================\n");

        // =================================================
        // 7. Call Static Methods
        // =================================================

        System.out.println("===== Calling Static Methods =====");

        staticMethodOne();

        System.out.println("\n-----------------------------------\n");

        staticMethodTwo();

        System.out.println("\n===================================\n");

        // =================================================
        // 7. Call Instance Methods
        // =================================================

        System.out.println("===== Calling Instance Methods =====");

        obj.instanceMethodOne();

        System.out.println("\n-----------------------------------\n");

        obj.instanceMethodTwo();
    }
}