import java.util.*;
class SwitchCaseEg1{
     public static void main(String[] args){
          int result=0;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your 1st value: ");
          int a = sc.nextInt();
          System.out.print("Enter your 1st value: ");
          int b = sc.nextInt();
          System.out.println("What you want to do: A - Sum,\nB - Minus,\n C - Multiple,\n D - Division!");
          String operation = sc.nextLine();
          switch(operation) {
               case "A":
                    result = a+b;
                    System.out.println("Your sum of "+a+" and "+b+" = "+result);
               case "B":
                    result = a-b;
                    System.out.println("Your sum of "+a+" and "+b+" = "+result);
               case "C":
                    result = a*b;
                    System.out.println("Your sum of "+a+" and "+b+" = "+result);
               case "D":
                    result = a/b;
                    System.out.println("Your sum of "+a+" and "+b+" = "+result);
          }
     }
}