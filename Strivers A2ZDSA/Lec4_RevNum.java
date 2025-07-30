import java.util.Scanner;

// Your original Solution class
class Solution {
    public int reverseNumber(int n) {
        int rev = 0;

        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }
}

// Separate class with main method
public class Lec4_RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int n = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.reverseNumber(n);

        System.out.println("Reversed number: " + result);

        sc.close();
    }
}
