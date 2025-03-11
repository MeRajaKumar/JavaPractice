// Find Maximum of Three Numbers
import java.util.Scanner;
public class Maxofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number for check: ");
        float num1 = sc.nextInt();
        System.out.print("Enter 2nd number for check: ");
        float num2 = sc.nextInt();
        System.out.print("Enter 3rd number for check: ");
        float num3 = sc.nextInt();

        if(num1 > num2) {
            if(num1 > num3){
                System.out.print(num1+ " is maximum!");
            }else{
                System.out.print(num3+ " is maximum!");
            }
        }else{
                System.out.print(num2+" is maximum!");
            }
    }
}