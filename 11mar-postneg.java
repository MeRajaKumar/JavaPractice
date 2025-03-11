// Check if a Number is Positive or Negative
import java.util.Scanner;
public class Posorneg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for check positive or negative: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.print(num+" is positive number!");
        } else {
            System.out.print(num+" is negative number!");
        }
    }
}