import java.util.Scanner;

// Original logic class
class Solution {
    public boolean isPalindrome(int n) {
        int rev = 0;
        int rem;
        int newNum = n;

        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return newNum == rev;
    }
}

// Main class for input/output
public class Lec4_CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to check for palindrome: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(n);

        if (result) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

        sc.close();
    }
}
