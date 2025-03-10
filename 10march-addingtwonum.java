import java.util.Scanner;
class Practice {
    public static void main(String[] args) {
        // int num1 = 12;
        // int num2 = 13;
        int num1 = 122, num2 = 133;
        // int num3 = num1 + num2;

        // System.out.print("Sum of "+num1+" and "+num2+" = "+num3);
        // System.out.print("Sum of "+num1+" and "+num2+" = "+(num1+num2));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number :- ");
        int num4 = sc.nextInt();
        System.out.print("Enter a second number :- ");
        int num5 = sc.nextInt();

        int num6 = num4 + num5;
        System.out.print("Sum of "+num4+" and "+num5+" = "+(num4+num5));


    }
}