// Check if a Number is Even or Odd
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for check odd or even: ");
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.print(num+" is even number!");
        }else{
            System.out.print(num+" is odd number!");
        }
    }
}