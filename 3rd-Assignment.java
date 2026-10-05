/**
 * =========================================================
 * Assignment-3: Loops in Java
 * =========================================================
 *
 * Topics Covered:
 * 1. For Loop
 * 2. While Loop
 * 3. Equal and Not Equal Operators
 * 4. Odd and Even Numbers
 * 5. Largest Among Three Numbers
 * 6. Even Numbers Between 10 and 100
 * 7. Do-While Loop
 * 8. Armstrong Number
 * 9. Prime Number
 * 10. Palindrome Number
 * 11. Even/Odd using Switch
 * 12. Gender using Switch
 * 13. Multiple If-Else Statement
 *
 */

public class LoopsAssignment {

    public static void main(String[] args) {

        // =====================================================
        // 1. Print "Bright IT Career" 10 Times Using For Loop
        // =====================================================

        System.out.println("===== 1. For Loop =====");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bright IT Career");
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 2. Print Numbers 1 to 20 Using While Loop
        // =====================================================

        System.out.println("===== 2. While Loop =====");

        int number = 1;

        while (number <= 20) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println("\n\n===================================\n");

        // =====================================================
        // 3. Equal and Not Equal Operators
        // =====================================================

        System.out.println("===== 3. Equal and Not Equal =====");

        int a = 10;
        int b = 20;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("\n===================================\n");

        // =====================================================
        // 4. Print Odd and Even Numbers
        // =====================================================

        System.out.println("===== 4. Odd and Even Numbers =====");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 5. Largest Number Among Three Numbers
        // =====================================================

        System.out.println("===== 5. Largest Among Three =====");

        int num1 = 50;
        int num2 = 30;
        int num3 = 70;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Largest Number: " + largest);

        System.out.println("\n===================================\n");

        // =====================================================
        // 6. Even Numbers Between 10 and 100 Using While Loop
        // =====================================================

        System.out.println("===== 6. Even Numbers 10 to 100 =====");

        int evenNumber = 10;

        while (evenNumber <= 100) {

            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + " ");
            }

            evenNumber++;
        }

        System.out.println("\n\n===================================\n");

        // =====================================================
        // 7. Print 1 to 10 Using Do-While Loop
        // =====================================================

        System.out.println("===== 7. Do While Loop =====");

        int count = 1;

        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 10);

        System.out.println("\n\n===================================\n");

        // =====================================================
        // 8. Armstrong Number
        // =====================================================

        System.out.println("===== 8. Armstrong Number =====");

        int armstrongNumber = 153;
        int originalNumber = armstrongNumber;
        int sum = 0;

        while (armstrongNumber > 0) {

            int digit = armstrongNumber % 10;
            sum += digit * digit * digit;

            armstrongNumber /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 9. Prime Number
        // =====================================================

        System.out.println("===== 9. Prime Number =====");

        int primeNumber = 29;
        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= primeNumber / 2; i++) {

                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is Prime");
        } else {
            System.out.println(primeNumber + " is Not Prime");
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 10. Palindrome Number
        // =====================================================

        System.out.println("===== 10. Palindrome Number =====");

        int palindromeNumber = 121;
        int temp = palindromeNumber;
        int reverse = 0;

        while (temp > 0) {

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp /= 10;
        }

        if (reverse == palindromeNumber) {
            System.out.println(palindromeNumber + " is Palindrome");
        } else {
            System.out.println(palindromeNumber + " is Not Palindrome");
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 11. Even or Odd Using Switch
        // =====================================================

        System.out.println("===== 11. Even/Odd Using Switch =====");

        int checkNumber = 25;

        switch (checkNumber % 2) {

            case 0:
                System.out.println(checkNumber + " is Even");
                break;

            case 1:
                System.out.println(checkNumber + " is Odd");
                break;
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 12. Gender Using Switch
        // =====================================================

        System.out.println("===== 12. Gender Using Switch =====");

        char gender = 'M';

        switch (gender) {

            case 'M':
            case 'm':
                System.out.println("Male");
                break;

            case 'F':
            case 'f':
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalid Input");
        }

        System.out.println("\n===================================\n");

        // =====================================================
        // 13. Multiple If Else Statement
        // =====================================================

        System.out.println("===== 13. Multiple If Else =====");

        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z) {

            System.out.println("Largest Number: " + x);

        } else if (y > x && y > z) {

            System.out.println("Largest Number: " + y);

        } else {

            System.out.println("Largest Number: " + z);
        }
    }
}