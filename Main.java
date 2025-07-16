import java.util.Scanner;
import java.util.Arrays;

public class ArrayPrograms {

    // 1. Declare and Print Array
    static void printArray() {
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // 2. Input and Output Array
    static void inputAndPrintArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }

    // 3. Sum of Elements
    static void sumOfArray() {
        int[] arr = {5, 10, 15};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);
    }

    // 4. Average of Elements
    static void averageOfArray() {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Average: " + (double) sum / arr.length);
    }

    // 5. Maximum Element
    static void findMax() {
        int[] arr = {5, 25, 10};
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        System.out.println("Max: " + max);
    }

    // 6. Minimum Element
    static void findMin() {
        int[] arr = {5, 25, 10};
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        System.out.println("Min: " + min);
    }

    // 7. Count Even and Odd
    static void countEvenOdd() {
        int[] arr = {10, 15, 20, 25};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd : " + odd);
    }

    // 8. Print Even Indices
    static void printEvenIndices() {
        int[] arr = {5, 10, 15, 20};
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    // 9. Print Odd Indices
    static void printOddIndices() {
        int[] arr = {5, 10, 15, 20};
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    // 10. Count Positive and Negative
    static void countPosNeg() {
        int[] arr = {10, -5, 0, -3};
        int pos = 0, neg = 0;
        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
        }
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }

    // 11. Replace Negative with Zero
    static void replaceNegatives() {
        int[] arr = {10, -5, 0, -3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 12. Linear Search
    static void linearSearch() {
        int[] arr = {5, 10, 15, 20};
        int target = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    // 13. Copy Array
    static void copyArray() {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println(Arrays.toString(copy));
    }

    // 14. Reverse Array
    static void reverseArray() {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 15. Swap First and Last
    static void swapFirstLast() {
        int[] arr = {1, 2, 3, 4};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Call any function here to test:

        // printArray();
        // inputAndPrintArray();
        // sumOfArray();
        // averageOfArray();
        // findMax();
        // findMin();
        // countEvenOdd();
        // printEvenIndices();
        // printOddIndices();
        // countPosNeg();
        // replaceNegatives();
        // linearSearch();
        // copyArray();
        // reverseArray();
        // swapFirstLast();
    }
}
