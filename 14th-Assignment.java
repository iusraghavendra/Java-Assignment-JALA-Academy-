package ExceptionsAssignment;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * =========================================================
 * Assignment-14: Exceptions
 * =========================================================
 */

public class ExceptionsAssignment {

    // =====================================================
    // Question 3
    // Method Throwing Exception
    // =====================================================

    public static void throwException()
            throws Exception {

        throw new Exception(
                "Exception from method");
    }

    public static void main(String[] args) {

        // =================================================
        // 1. Arithmetic Exception Without Handling
        // =================================================

        System.out.println(
                "===== 1. Arithmetic Exception =====");

        /*
         * Uncomment to generate exception.
         */

        // int result = 10 / 0;

        System.out.println(
                "Code commented to allow execution.");

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 2. Arithmetic Exception Handling
        // =================================================

        System.out.println(
                "===== 2. Try-Catch =====");

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println(
                    "Arithmetic Exception Handled");
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 3. Method Throws Exception
        // =================================================

        System.out.println(
                "===== 3. Throws Exception =====");

        try {

            throwException();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 4. Multiple Catch Blocks
        // =================================================

        System.out.println(
                "===== 4. Multiple Catch =====");

        try {

            String value = null;

            value.length();

        } catch (ArithmeticException e) {

            System.out.println(
                    "Arithmetic Exception");

        } catch (NullPointerException e) {

            System.out.println(
                    "NullPointer Exception");

        } catch (Exception e) {

            System.out.println(
                    "General Exception");
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 5. Throw Exception with Own Message
        // =================================================

        System.out.println(
                "===== 5. Custom Message =====");

        try {

            throw new Exception(
                    "My Custom Exception Message");

        } catch (Exception e) {

            System.out.println(
                    e.getMessage());
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 6. Custom Exception
        // =================================================

        System.out.println(
                "===== 6. Custom Exception =====");

        try {

            throw new CustomException(
                    "Custom Exception Occurred");

        } catch (CustomException e) {

            System.out.println(
                    e.getMessage());
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 7. Finally Block
        // =================================================

        System.out.println(
                "===== 7. Finally Block =====");

        try {

            int number = 10 / 2;

        } catch (Exception e) {

            System.out.println(
                    "Exception");

        } finally {

            System.out.println(
                    "Finally Block Executed");
        }

        System.out.println(
                "\n===================================\n");

        // =================================================
        // 8. Arithmetic Exception
        // =================================================

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println(
                    "ArithmeticException Generated");
        }

        // =================================================
        // 9. ArrayIndexOutOfBoundsException
        // =================================================

        try {

            int[] arr = { 1, 2, 3 };

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "ArrayIndexOutOfBoundsException Generated");
        }

        // =================================================
        // 10. ClassNotFoundException
        // =================================================

        try {

            Class.forName(
                    "InvalidClass");

        } catch (ClassNotFoundException e) {

            System.out.println(
                    "ClassNotFoundException Generated");
        }

        // =================================================
        // 11. FileNotFoundException
        // =================================================

        try {

            FileInputStream file = new FileInputStream(
                    "abc.txt");

        } catch (FileNotFoundException e) {

            System.out.println(
                    "FileNotFoundException Generated");
        }

        // =================================================
        // 12. IOException
        // =================================================

        try {

            FileReader file = new FileReader(
                    "sample.txt");

            file.close();

            file.read();

        } catch (IOException e) {

            System.out.println(
                    "IOException Generated");
        }

        // =================================================
        // 13. NoSuchFieldException
        // =================================================

        try {

            Field field = String.class.getField(
                    "invalidField");

        } catch (NoSuchFieldException e) {

            System.out.println(
                    "NoSuchFieldException Generated");
        }

        // =================================================
        // 14. NoSuchMethodException
        // =================================================

        try {

            Method method = String.class.getMethod(
                    "invalidMethod");

        } catch (NoSuchMethodException e) {

            System.out.println(
                    "NoSuchMethodException Generated");
        }

        // =================================================
        // 15. NullPointerException
        // =================================================

        try {

            String text = null;

            text.length();

        } catch (NullPointerException e) {

            System.out.println(
                    "NullPointerException Generated");
        }

        // =================================================
        // 16. NumberFormatException
        // =================================================

        try {

            Integer.parseInt(
                    "ABC");

        } catch (NumberFormatException e) {

            System.out.println(
                    "NumberFormatException Generated");
        }

        // =================================================
        // 17. StringIndexOutOfBoundsException
        // =================================================

        try {

            String text = "Java";

            System.out.println(
                    text.charAt(20));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(
                    "StringIndexOutOfBoundsException Generated");
        }

        // =================================================
        // 18. SQLException
        // =================================================

        try {

            throw new SQLException(
                    "Database Error");

        } catch (SQLException e) {

            System.out.println(
                    "SQLException Generated");
        }

        System.out.println(
                "\n===================================\n");

        System.out.println(
                "All Exception Examples Executed Successfully");
    }
}


package ExceptionsAssignment;

/**
 * =========================================================
 * Question 6
 * Custom Exception
 * =========================================================
 */

public class CustomException extends Exception {

    public CustomException(String message) {

        super(message);
    }
}
