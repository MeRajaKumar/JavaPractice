// Check if a Number is a Palindrome
import java.util.Scanner;
public class PalindromeNumCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number for check: ");
        float num = sc.nextInt();

        int originalNum = (int) num;
        int reversedNum = 0;
        int temp = originalNum;

        while (temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}