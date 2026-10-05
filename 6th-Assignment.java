/**
 * =========================================================
 * Assignment-6: Strings in Java
 * =========================================================
 *
 * Topics Covered:
 * 1. Creating Strings
 * 2. String Concatenation
 * 3. String Length
 * 4. Substring
 * 5. indexOf()
 * 6. matches()
 * 7. equals()
 * 8. equalsIgnoreCase(), startsWith(),
 * endsWith(), compareTo()
 * 9. trim()
 * 10. replace()
 * 11. split()
 * 12. String.valueOf()
 * 13. Integer Object to String
 * 14. toUpperCase() and toLowerCase()
 *
 */

public class StringsAssignment {

    public static void main(String[] args) {

        // =====================================================
        // 1. Different Ways of Creating Strings
        // =====================================================

        System.out.println("===== 1. Creating Strings =====");

        String str1 = "Hello Java";

        String str2 = new String("Welcome");

        char[] characters = { 'J', 'A', 'V', 'A' };

        String str3 = new String(characters);

        System.out.println("String Literal : " + str1);
        System.out.println("Using new      : " + str2);
        System.out.println("Using char[]   : " + str3);

        System.out.println("\n===================================\n");

        // =====================================================
        // 2. Concatenating Strings
        // =====================================================

        System.out.println("===== 2. String Concatenation =====");

        String firstName = "Java";
        String lastName = "Programming";

        String fullText = firstName + " " + lastName;

        System.out.println(fullText);

        System.out.println("\n===================================\n");

        // =====================================================
        // 3. Finding Length of String
        // =====================================================

        System.out.println("===== 3. String Length =====");

        String message = "Bright IT Career";

        System.out.println("Length : " + message.length());

        System.out.println("\n===================================\n");

        // =====================================================
        // 4. Extract String Using Substring
        // =====================================================

        System.out.println("===== 4. Substring =====");

        String language = "Java Programming";

        System.out.println(language.substring(0, 4));

        System.out.println("\n===================================\n");

        // =====================================================
        // 5. Searching Using indexOf()
        // =====================================================

        System.out.println("===== 5. indexOf() =====");

        String sentence = "Learning Java is easy";

        System.out.println("Position of Java : "
                + sentence.indexOf("Java"));

        System.out.println("\n===================================\n");

        // =====================================================
        // 6. Regular Expression Matching
        // =====================================================

        System.out.println("===== 6. matches() =====");

        String email = "student123@gmail.com";

        boolean result = email.matches(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

        System.out.println("Valid Email : " + result);

        System.out.println("\n===================================\n");

        // =====================================================
        // 7. Comparing Strings Using equals()
        // =====================================================

        System.out.println("===== 7. equals() =====");

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("\n===================================\n");

        // =====================================================
        // 8. String Comparison Methods
        // =====================================================

        System.out.println("===== 8. String Comparison Methods =====");

        String text1 = "Java";
        String text2 = "java";

        System.out.println("equalsIgnoreCase() : "
                + text1.equalsIgnoreCase(text2));

        System.out.println("startsWith(\"Ja\") : "
                + text1.startsWith("Ja"));

        System.out.println("endsWith(\"va\") : "
                + text1.endsWith("va"));

        System.out.println("compareTo() : "
                + text1.compareTo(text2));

        System.out.println("\n===================================\n");

        // =====================================================
        // 9. Trimming Strings
        // =====================================================

        System.out.println("===== 9. trim() =====");

        String text = "    Java Programming    ";

        System.out.println("Before Trim : [" + text + "]");
        System.out.println("After Trim  : [" + text.trim() + "]");

        System.out.println("\n===================================\n");

        // =====================================================
        // 10. Replacing Characters
        // =====================================================

        System.out.println("===== 10. replace() =====");

        String original = "I like Java";

        String updated = original.replace("Java", "Python");

        System.out.println(updated);

        System.out.println("\n===================================\n");

        // =====================================================
        // 11. Splitting Strings
        // =====================================================

        System.out.println("===== 11. split() =====");

        String colors = "Red,Blue,Green,Yellow";

        String[] colorArray = colors.split(",");

        for (String color : colorArray) {

            System.out.println(color);
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 12. Converting Numbers to Strings
        // =====================================================

        System.out.println("===== 12. valueOf() =====");

        int number = 100;

        String numberString = String.valueOf(number);

        System.out.println(numberString);

        System.out.println("\n===================================\n");

        // =====================================================
        // 13. Integer Object to String
        // =====================================================

        System.out.println("===== 13. Integer Object to String =====");

        Integer integerObject = 500;

        String convertedString = integerObject.toString();

        System.out.println(convertedString);

        System.out.println("\n===================================\n");

        // =====================================================
        // 14. Uppercase and Lowercase
        // =====================================================

        System.out.println("===== 14. Uppercase & Lowercase =====");

        String company = "Bright IT Career";

        System.out.println("Uppercase : "
                + company.toUpperCase());

        System.out.println("Lowercase : "
                + company.toLowerCase());

        System.out.println("\n===================================\n");
    }
}