import java.util.*;
class ApnaCollegePractice{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);


          // Java Lacture 6 : -
          // Que number 1 : pettern programs

          
          // Que number 2 : pettern programs
          // Que number 3 : pettern programs
          // Que number 4 : pettern programs
          // Que number 5 : pettern programs
          // Home Work : pettern programs number 1






          // Java Lacture 5 : -
          // Que number 1 : pettern programs
          // int i=1;
          // while(i<4){
          //       for(int j=0; j<6;j++){
          //           System.err.print("*");
          //       }
          //      System.err.println();               
          //      i++;
          // }

          // Que number 2 :
          // int n = 5;
          // int m = 4;
          // for(int i=0; i<n; i++) {
          //      for(int j=0; j<m; j++) {
          //           if(i == 0 || i == n-1 || j == 0 || j == m-1) {
          //           System.out.print("*");
          //           } else {
          //           System.out.print(" ");
          //           }
          //      }
          //      System.out.println();
          // }

          // Que number 3 : in copy
          // Que number 4 : in copy
          // Que number 5 : in copy

          // Que number 6 : 
          // int n = 5;
          // for(int i=1; i<=n; i++) {
          //      for(int j=1; j<=i; j++) {
          //           System.out.print(j);
          //      }
          //      System.out.println();
          // }
                    
          // Que number 7 : 
          // int n = 5;
          // for(int i=n; i>=1; i--) {
          //      for(int j=1; j<=i; j++) {
          //           System.out.print(j);
          //      }
          //      System.out.println();
          // }
          
          // Que number 8 : 
          // int n = 5;
          // int number = 1;
          // for(int i=1; i<=n; i++) {
          //      for(int j=1; j<=i; j++) {
          //           System.out.print(number+" ");
          //           number++;
          //      }
          //      System.out.println();
          // }          

          // Que number 9 : 
          // int n = 5;
          // for(int i=1; i<=n; i++) {
          //      for(int j=1; j<=i; j++) {
          //           if((i+j) % 2 == 0) {
          //                System.out.print(1+" ");
          //           } else {
          //                System.out.print(0+" ");
          //           }
          //      }
          //      System.out.println();
          // }          

          // Home work Probelm : Number 1
          
          // Home work Probelm : Number 2

          // Home work Probelm : Number 3
          


          



          // Java Lacture 4 : -
          // Que number 1 :  Print all even numbers till n?
          // System.out.print("Enter your n number for checking even! :");
          // int numN = sc.nextInt();
          // int i = 1;
          // while(i<=numN){
          //      if(i%2==0)
          //      System.out.print(i+",");
          //      i++;
          // }
 
          // Que number 2 : run this
               // for(; ;) {
               //      System.out.println("Apna College");
               //      }
               
          // que number 3 : student marks review.
          // System.out.print("Enter number either 1 or 0 :- ");
          // int inpt = sc.nextInt();
          // if(inpt==1){
          //      System.out.print("Plz enter your total marks :- ");
          //      int marks = sc.nextInt();
          //      if(marks <=100 && marks >= 90){
          //           System.out.println(marks+" wow! this is good.");
          //      }else if(89 >= marks && marks >= 60){
          //           System.out.println(marks+" excilenet! this is also good.");
          //      }else if(59 >= marks  && marks >= 0){
          //           System.out.println(marks+" great! This is good as well");
          //      }else{
          //           System.out.println("Enter a valid mark!!");
          //      }
          // }else if(inpt==0){
          //      System.out.println("Entered 0!!");
          // }

          // Que number 4 : Bonus (prime or not!!)(prime or not in n number??)
          // int m=0,flag=0,i;     
          // System.err.print("enter a number for checking prime or not : - ");
          // int prime = sc.nextInt();
          // m=prime/2;      
          // if(prime==0||prime==1){  
          //      System.out.println(prime+" is not prime number");      
          // }else{  
          //      for(i=2;i<=m;i++){      
          //           if(prime%i==0){      
          //                System.out.println(prime+" is not prime number");      
          //                flag=1;      
          //                break;      
          //           }      
          //      }      
          //      if(flag==0)  { System.out.println(prime+" is prime number"); }  
          // }
               //method 2**
          // int n = sc.nextInt();
          //      boolean isPrime = true;
          //      for(int i=2; i<=n/2; i++) {
          //      if(n % i == 0) {
          //      isPrime = false;
          //      break;
          //      }
          //      }
          //      if(isPrime) {
          //      if(n == 1) {
          //      System.out.println("This is neither prime not composite");
          //      } else {
          //      System.out.println("This is a prime number");
          //      }
          //      } else {
          //      System.out.println("This is not a prime number");
          //      }
          //      }
                 

          
          // Java Lacture 3 : -
          // Question no 1
          // int result = 0;
          // System.out.println("enter 1st number for operation : ");
          // int num1 = sc.nextInt();
          // System.out.println("Enter 2nd number for operation : ");
          // int num2 = sc.nextInt();
          // System.out.println("Select your operation for that : A - Sum,\n B - Minus,\n C - Multiple,\n D - Devision,\n E - Modulas!");
          // String operation = sc.nextLine();
          // switch(operation) {
          //      case "A":
          //           result = a+b;
          //           System.out.println("Your sum of "+num1+" and "+num2+" = "+result);
          //           break;
          //      case "B":
          //           result = a-b;
          //           System.out.println("Your sum of "+num1+" and "+num2+" = "+result);
          //           break;
          //      case "C":
          //           result = a*b;
          //           System.out.println("Your sum of "+num1+" and "+num2+" = "+result);
          //           break;
          //      case "D" : 
          //                if(num2 == 0) {
          //                     System.out.println("Invalid Division");
          //                } else {
          //                     System.out.println(num1/num2);
          //                }
          //                break;
          //      case "E" : 
          //                if(num2 == 0) {
          //                System.out.println("Invalid Division");
          //                } else {
          //                System.out.println(num1%num2);
          //                }
          //      default:
          //      System.out.println("please select a valid character!!");
          // }
          // Question no 2
          // Scanner sc = new Scanner(system.in);
          // System.out.println("enter your month for checking!! : ");
          // int month = sc.nextInt();
          // switch(month) {
          //      case 1:
          //           System.out.println("Your entered month is : "+month+"\n Your month is January!");
          //           break;
          //      case 2:
          //           System.out.println("Your entered month is : "+month+"\n Your month is February!");
          //           break;
          //      case 3:
          //           System.out.println("Your entered month is : "+month+"\n Your month is march!");
          //           break;
          //      case 4:
          //           System.out.println("Your entered month is : "+month+"\n Your month is april!");
          //           break;
          //      case 5:
          //           System.out.println("Your entered month is : "+month+"\n Your month is May!");
          //           break;
          //      case 6:
          //           System.out.println("Your entered month is : "+month+"\n Your month is June!");
          //           break;
          //      case 7:
          //           System.out.println("Your entered month is : "+month+"\n Your month is July!");
          //           break;
          //      case 8:
          //           System.out.println("Your entered month is : "+month+"\n Your month is August!");
          //           break;
          //      case 9:
          //           System.out.println("Your entered month is : "+month+"\n Your month is September!");
          //           break;
          //      case 10:
          //           System.out.println("Your entered month is : "+month+"\n Your month is October!");
          //           break;
          //      case 11:
          //           System.out.println("Your entered month is : "+month+"\n Your month is Novembe!");
          //           break;
          //      case 12:
          //           System.out.println("Your entered month is : "+month+"\n Your month is December!");
          //           break;
          //      default:
          //      System.out.println("please select a invalid character!!");
          // }

          // Java Lacture 2 : -
          // Que number 1
          // System.out.println("enter the raduis of circle?? ");
          // int raduisx = sc.nextInt();
          // double area = 3.142 * raduisx * raduisx; 
          // System.out.println("Your circle of area is : "+ area);
          // Que number 2
          // System.out.println("Enter the number for printing the table : ");
          // int num = sc.nextInt();
          // int i=1;
          // while(num < 11){
          //      System.out.println(num +" * "+ i + " = "+ (num*i));
          //      i=i+1;
          // }

     }
}