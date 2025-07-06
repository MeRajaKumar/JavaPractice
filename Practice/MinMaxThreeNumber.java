// Find Maximum of Three Numbers
import java.util.Scanner;
public class MinMaxThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number for check: ");
        float num1 = sc.nextInt();
        System.out.print("Enter 2nd number for check: ");
        float num2 = sc.nextInt();
        System.out.print("Enter 3rd number for check: ");
        float num3 = sc.nextInt();

        // finding maximum
        int max = Math.max(num1, Math.max(num2,num3));
        // finding minimum
        int min = Math.min(num1, Math.min(num2,num3));

        System.out.print("Maximum number : "+max);
        System.out.print("Minimum number : "+min);

        // method 2 :
        int max1, min1;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        scanner.close();
    }
}