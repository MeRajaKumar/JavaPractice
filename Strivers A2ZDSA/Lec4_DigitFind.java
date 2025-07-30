// Question: Count the Number of Digits in an Integer
// 🔹 Problem Statement:
// Write a Java program to count the number of digits in a given integer n.
// The number may be positive, negative, or zero.
// The program should correctly ignore the negative sign while counting digits.

public class Main {
    
    // Method to count digits
    public static int countDigit(int n) {
        if (n == 0) return 1;

        n = Math.abs(n);  // Make sure the number is positive
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 4;
        int num2 = 14;
        int num3 = -123;
        int num4 = 0;

        System.out.println("Digits in " + num1 + ": " + countDigit(num1)); // Output: 1
        System.out.println("Digits in " + num2 + ": " + countDigit(num2)); // Output: 2
        System.out.println("Digits in " + num3 + ": " + countDigit(num3)); // Output: 3
        System.out.println("Digits in " + num4 + ": " + countDigit(num4)); // Output: 1
    }
}
