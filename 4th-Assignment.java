import java.util.*;

public class ArraysAssignment {

    // =====================================================
    // 1. Sum of Array Elements
    // =====================================================
    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    // =====================================================
    // 2. Average of Array Elements
    // =====================================================
    public static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    // =====================================================
    // 3. Find Index of Element
    // =====================================================
    public static int findIndex(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // =====================================================
    // 4. Check if Array Contains Value
    // =====================================================
    public static boolean containsValue(int[] arr, int value) {

        for (int num : arr) {

            if (num == value) {
                return true;
            }
        }

        return false;
    }

    // =====================================================
    // 5. Remove Specific Element
    // =====================================================
    public static int[] removeElement(int[] arr, int value) {

        int count = 0;

        for (int num : arr) {

            if (num != value) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : arr) {

            if (num != value) {
                result[index++] = num;
            }
        }

        return result;
    }

    // =====================================================
    // 6. Copy Array
    // =====================================================
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // =====================================================
    // 7. Insert Element at Specific Position
    // =====================================================
    public static int[] insertElement(int[] arr, int value, int position) {

        int[] result = new int[arr.length + 1];

        for (int i = 0, j = 0; i < result.length; i++) {

            if (i == position) {
                result[i] = value;
            } else {
                result[i] = arr[j++];
            }
        }

        return result;
    }

    // =====================================================
    // 8. Min and Max
    // =====================================================
    public static void findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum Value : " + min);
        System.out.println("Maximum Value : " + max);
    }

    // =====================================================
    // 9. Reverse Array
    // =====================================================
    public static void reverseArray(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // =====================================================
    // 10. Duplicate Values
    // =====================================================
    public static void findDuplicates(int[] arr) {

        System.out.print("Duplicate Values : ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    // =====================================================
    // 11. Common Values Between Arrays
    // =====================================================
    public static void commonElements(int[] arr1, int[] arr2) {

        System.out.print("Common Elements : ");

        for (int num1 : arr1) {

            for (int num2 : arr2) {

                if (num1 == num2) {

                    System.out.print(num1 + " ");
                }
            }
        }

        System.out.println();
    }

    // =====================================================
    // 12 & 18. Remove Duplicates
    // =====================================================
    public static int[] removeDuplicates(int[] arr) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];

        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    // =====================================================
    // 13 & 14. Second Largest Number
    // =====================================================
    public static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // =====================================================
    // 15. Count Even and Odd Numbers
    // =====================================================
    public static void countEvenOdd(int[] arr) {

        int even = 0;
        int odd = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers : " + even);
        System.out.println("Odd Numbers  : " + odd);
    }

    // =====================================================
    // 16. Difference Between Largest and Smallest
    // =====================================================
    public static int differenceMaxMin(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    // =====================================================
    // 17. Check if Contains 12 and 23
    // =====================================================
    public static boolean contains12And23(int[] arr) {

        boolean has12 = false;
        boolean has23 = false;

        for (int num : arr) {

            if (num == 12) {
                has12 = true;
            }

            if (num == 23) {
                has23 = true;
            }
        }

        return has12 && has23;
    }

    // =====================================================
    // 19. Missing Number (1 to 100)
    // =====================================================
    public static int findMissingNumber(int[] arr) {

        int expectedSum = 100 * 101 / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // =====================================================
    // Main Method
    // =====================================================
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 20, 10, 60, 23, 12 };
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        System.out.println("1. Sum = " + sumArray(arr));

        System.out.println("2. Average = " + averageArray(arr));

        System.out.println("3. Index of 40 = " + findIndex(arr, 40));

        System.out.println("4. Contains 50 = "
                + containsValue(arr, 50));

        System.out.println("5. Remove 20 = "
                + Arrays.toString(removeElement(arr, 20)));

        System.out.println("6. Copy Array = "
                + Arrays.toString(copyArray(arr)));

        System.out.println("7. Insert 99 at Position 2 = "
                + Arrays.toString(insertElement(arr, 99, 2)));

        System.out.println("\n8. Min and Max");
        findMinMax(arr);

        System.out.println("\n9. Reverse Array");
        reverseArray(arr);

        System.out.println("\n10. Duplicate Values");
        findDuplicates(arr);

        System.out.println("\n11. Common Elements");
        commonElements(arr1, arr2);

        System.out.println("\n12. Remove Duplicates");
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        System.out.println("\n13. Second Largest = "
                + secondLargest(arr));

        System.out.println("\n15. Even and Odd Count");
        countEvenOdd(arr);

        System.out.println("\n16. Difference Max-Min = "
                + differenceMaxMin(arr));

        System.out.println("\n17. Contains 12 and 23 = "
                + contains12And23(arr));

        System.out.println("\n18. Remove Duplicate Elements");
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        int[] missingArray = new int[99];

        int index = 0;

        for (int i = 1; i <= 100; i++) {

            if (i != 57) {
                missingArray[index++] = i;
            }
        }

        System.out.println("\n19. Missing Number = "
                + findMissingNumber(missingArray));
    }
}