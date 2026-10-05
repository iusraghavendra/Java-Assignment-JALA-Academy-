/**
 * =========================================================
 * Assignment-2: Operators in Java
 * =========================================================
 *
 * Topics Covered:
 * 1. Arithmetic Operators
 * 2. Increment and Decrement Operators
 * 3. Equal and Not Equal Operators
 * 4. Check Whether Two Numbers are Equal
 * 5. Logical Operators (AND, OR, NOT)
 * 6. Relational Operators
 * 7. Find Smaller and Larger Number
 *
 */

public class OperatorsAssignment {

    // =====================================================
    // 1. Arithmetic Operators
    // =====================================================

    public void arithmeticOperations(int a, int b) {

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        if (b != 0) {
            System.out.println("Division       : " + (a / b));
        } else {
            System.out.println("Division       : Cannot divide by zero");
        }
    }

    // =====================================================
    // 2. Increment and Decrement Operators
    // =====================================================

    public void incrementDecrement() {

        int number = 10;

        System.out.println("Original Value : " + number);

        number++;
        System.out.println("After Increment: " + number);

        number--;
        System.out.println("After Decrement: " + number);
    }

    // =====================================================
    // 3. Equal and Not Equal Operators
    // =====================================================

    public void equalityOperators(int a, int b) {

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    // =====================================================
    // 4. Check Whether Two Numbers are Equal
    // =====================================================

    public void checkEqualNumbers(int a, int b) {

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Both numbers are not equal.");
        }
    }

    // =====================================================
    // 5. Logical Operators
    // =====================================================

    public void logicalOperators() {

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("Logical AND (&&): "
                + (condition1 && condition2));

        System.out.println("Logical OR (||): "
                + (condition1 || condition2));

        System.out.println("Logical NOT (!): "
                + (!condition1));
    }

    // =====================================================
    // 6. Relational Operators
    // =====================================================

    public void relationalOperators(int a, int b) {

        System.out.println("a < b  : " + (a < b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
    }

    // =====================================================
    // 7. Print Smaller and Larger Number
    // =====================================================

    public void smallerAndLarger(int a, int b) {

        if (a > b) {

            System.out.println("Larger Number  : " + a);
            System.out.println("Smaller Number : " + b);

        } else if (b > a) {

            System.out.println("Larger Number  : " + b);
            System.out.println("Smaller Number : " + a);

        } else {

            System.out.println("Both numbers are equal.");
        }
    }

    // =====================================================
    // Main Method
    // =====================================================

    public static void main(String[] args) {

        OperatorsAssignment obj = new OperatorsAssignment();

        System.out.println("===== 1. Arithmetic Operators =====");

        obj.arithmeticOperations(20, 5);

        System.out.println("\n===================================\n");

        System.out.println("===== 2. Increment & Decrement =====");

        obj.incrementDecrement();

        System.out.println("\n===================================\n");

        System.out.println("===== 3. Equal & Not Equal Operators =====");

        obj.equalityOperators(10, 20);

        System.out.println("\n===================================\n");

        System.out.println("===== 4. Check Equal Numbers =====");

        obj.checkEqualNumbers(15, 15);

        System.out.println("\n===================================\n");

        System.out.println("===== 5. Logical Operators =====");

        obj.logicalOperators();

        System.out.println("\n===================================\n");

        System.out.println("===== 6. Relational Operators =====");

        obj.relationalOperators(25, 10);

        System.out.println("\n===================================\n");

        System.out.println("===== 7. Smaller & Larger Number =====");

        obj.smallerAndLarger(40, 25);
    }
}