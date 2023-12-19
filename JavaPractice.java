import java.util.Scanner;
public class JavaPractice{
public static void main(String args[]){

    //       👉 String Class Questions 👈
    // 1️⃣ WAP to display use of string class??⬇️👍
    // Scanner sc = new Scanner(System.in);
    //     String input3 = new String();
    //     System.out.print("Enter a string :- ");
    //     input3 = sc.nextLine();                             //method 1
    // String input1 = new String("Aayush Gupta");    //method 2
    // String input2 = "Hellow world! This is Aayush Gupta";   //method 3
    // System.out.println("value of object1 : \t" + input1);
    // System.out.println("value of object2 : \t" + input2);
    // System.out.println("value of object3 : \t" + input3);



    // 2️⃣ WAJP to accept a string and display it’s all element one by one??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // String input = new String();
    // System.out.print("Enter a String To print it's all element one by one :- ");
    // input = sc.nextLine();
    // int length = input.length();
    // //System.out.println("Starting index " + ob1.indexOf('A')); //fixed!
    // //System.out.println("Length of string " + ob1.length());
    // for(int i=0;i<length;i++){
    //     System.out.println((i+1) + "\t Element of Givern Sting is :\t" + input.charAt(i));
    // }
    


    // 3️⃣ WAJP to accept a string, then accept index from where user want to see character??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // String input = new String();
    // System.out.print("Enter a String :- ");
    // input = sc.nextLine();
    // System.out.print("Enter index value from you want to display char :- ");
    // int index = sc.nextInt();
    // System.out.println("\t Data on given index is : " + input.charAt(index));



    // 4️⃣ WAJP TO accept a string and display all vowel with its index position??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // String input = new String();
    // System.out.print("Enter a String to display all vowel with their index position\t:-\t");
    // input = sc.nextLine();
    // String combine_lower_case = new String(input);
    // input = combine_lower_case.toLowerCase();
    // int last = input.length();
    // for(int i=0;i<last;i++){
    //     if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' 
    //     || input.charAt(i)=='o' || input.charAt(i)=='u')
    //         System.out.println("A vowel Charector is founded on index : " + i + " and it is :- " + input.charAt(i)); 
    //     }
        


    // 5️⃣ WAP to accept a string and check it is palindrome or not??
    // Scanner sc = new Scanner(System.in);
    // System.out.printf("plz enter your string :- ");
    // String str = sc.nextLine(),reverseStr = "";
    // //String reverseStr = "";
    // int strLength = str.length();
    //     for (int i = (strLength - 1); i >=0; --i) {
    //         reverseStr = reverseStr + str.charAt(i);
    //     }
    //     if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
    //         System.out.println(str + " is a Palindrome String.");
    //     }
    //     else {
    //     System.out.println(str + " is not a Palindrome String.");
    //     }



    // 6️⃣ WAP to accept first name, last name of student and store it in full name and display it??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // String ob1,ob2,ob3;
    // System.out.print("Enter First Name :");
    // ob1=sc.nextLine();
    // System.out.print("Enter Last Name :");
    // ob2=sc.nextLine();
    // ob3=ob1.concat(ob2);      //full name through concat method
    // System.out.print("first name : "+ob1 + "\n Last Name :"+ob2+ "\n Full Name :- "+ ob3);



    // 7️⃣ WAJP to accept a string and change its case to upper, lower and display it??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a string for displaying :- ");
    // String name = new String();
    // name = sc.nextLine();
    // String name_uper_case= name.toUpperCase();
    // String name_lower_case= name.toLowerCase();
    // System.out.println("Real string is : "+name+"\nUppercase is : "
    //     +name_uper_case+"\nLowercase is : "+name_lower_case);



    // 8️⃣ WAP to accept full name and after that accept last name to change their last name, then display it??⬇️👍 
    // String firstName="Aayush";
    // String lastName="Gupta";
    // String newLastName=lastName.replace("gupta","kumar");
    // System.out.println("First name : "+firstName+"\nLast name : "+lastName+
    //     "\nNew last name after replacing : "+newLastName);



    // 9️⃣ WAP to accept a string. Then string for search in given string, then display its staring position if it is founded??



    //Que>>2️⃣2️⃣WAJP to find maximum between three numbers??⬇️👍
    // Scanner input = new Scanner(System.in);
    // System.out.print("Plz enter yr 1st number :- ");
    // int num1=input.nextInt();
    // System.out.print("Plz enter yr 2st number :- ");
    // int num2=input.nextInt();
    // System.out.print("Plz enter yr 3st number :- ");
    // int num3=input.nextInt();
    //     if((num1>num2) && (num1>num3)){
    //         System.out.println(num1+" Is maximum number!");
    //     } if((num2>num1) && (num2>num3)){
    //         System.out.println(num2+" Is maximum number!");
    //     } if((num3>num1) && (num1>num2)){
    //         System.out.println(num3+" Is maximum number!");
    //     }



    //Que>>2️⃣1️⃣WAJP to print the size of data types??⬇️👍
    /*
    System.out.println("S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t");
    System.out.println("1\t  Byte\t\t" +  Byte.SIZE+    "\t"+  Byte.MIN_VALUE+    "\t\t\t" + Byte.MAX_VALUE);
    System.out.println("2\t  Short\t\t" + Short.SIZE+   "\t"+  Short.MIN_VALUE +  "\t\t\t" + Short.MAX_VALUE);
    System.out.println("3\t  Integer\t" + Integer.SIZE+ "\t"+  Integer.MIN_VALUE +"\t\t" +   Integer.MAX_VALUE);
    System.out.println("4\t  Float\t\t" + Float.SIZE +  "\t" + Float.MIN_VALUE +  "\t\t\t"+ Float.MAX_VALUE);             
    System.out.println("5\t  Long\t\t" +  Long.SIZE +   "\t" + Long.MIN_VALUE +   "\t"+     Long.MAX_VALUE);               
    System.out.println("6\t  Double\t" +  Double.SIZE + "\t" + Double.MIN_VALUE + "\t\t" +   Short.MAX_VALUE);
    System.out.println("7\t  Character\t" + Character.SIZE);
    */
                       


    //Que>>2️⃣0️⃣WAJP to accept a character and display it's type??⬇️👍
    // 0 - 9 = (48 - 57)  symbol - (0 - 47)
    // A - Z = (65 - 90)           (58 - 64)
    // a - z = (97 - 122)          (91 - 96) and (123 - 127)
    // System.out.print("Enter key to check it's number or character symboled :- ");
    // Scanner input = new Scanner (System.in);
    // char key = input.next().charAt(0);  //way to accept value in char
    //     if (key >= 48 && key < 57){
    //         System.out.println(key + " - It's a number!");
    //     }
    //     if(key >=65 && key <=90 || key >=97 && key <=122){
    //         System.out.println(key + " - It's is a Alphabate!");
    //     }
    //     if((key<48) || (key>57 && key<65) || (key>90 && key<97) || (key>122 && key<127)){
    //         System.out.println(key + " - It's symbol!");
    //     }



    //Que>> 1️⃣9️⃣ WAJP to accept a number and diplay in reverse oder??⬇️👍⬇️👍 
    // Only for number ⬇️
    // int num,rev=0,i,d;
    // System.out.print("plz enter your number :- ");
    // Scanner sc=new Scanner(System.in);
    // num = sc.nextInt();
    //     for(i=num;i>0;i/=10){
    //         d=i%10;
    //         rev=rev*10+d;
    //     }
    // System.out.println("Reverse of num "+num+" = "+rev);



    //Que>> 1️⃣8️⃣ WAJP to accept a number and diplay sqare root??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Plz enter the base :- ");
    // double num = sc.nextInt();
    // System.out.println(num +" of sqare root is = "+Math.sqrt(num));


    
    //Que>> 1️⃣7️⃣ WAJP to accept a number and the power of a number an display result??⬇️👍
    // Using pow() function ◀️
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Plz enter the base :- ");
    // int base = sc.nextInt();
    // System.out.print("Plz enter exponent(power) :- ");
    // int exponent = sc.nextInt();
    // double result = Math.pow(base, exponent);
    // System.out.println("Answer is of "+ base +"^"+ exponent + " = " + result);
    // Using while loop function ◀️
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Plz enter the base :- ");
    // int base = sc.nextInt();
    // System.out.print("Plz enter exponent(power) :- ");
    // int exponent = sc.nextInt();
    // long result = 1;
    //     while (exponent != 0) {
    //         result *= base;
    //         --exponent;
    //     }      
    // System.out.println("Answer is of "+ base +"^"+ exponent + " = " + result);
    // Using for loop ◀️
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Plz enter the base :- ");
    // int base = sc.nextInt();
    // System.out.print("Plz enter exponent(power) :- ");
    // int exponent = sc.nextInt();
    // long result = 1;
    //     for (; exponent != 0; --exponent) {
    //         result *= base;
    //     }
    // System.out.println("Answer = " + result);
  


    //Que>> 1️⃣6️⃣ WAJP to print factorial of any number??⬇️👍
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter number for factorial :- ");
    // int num = sc.nextInt();
    // int fact=1;
    // for(int i=1;i<=num;i++){
    //     fact=i*fact;
    //     System.out.print(i+" * ");
    // }
    // System.out.print("\b\b= "+fact);



    //Que>> 1️⃣5️⃣ WAJP to swipe two number without third variable??⬇️👍
    // int a,b;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter your number a:- ");
    // a = sc.nextInt();
    // System.out.print("Plz enter your number b:- ");
    // b = sc.nextInt();
    // b=a+b;
    // a=b-a;
    // b=b-a;
    // System.out.println(a+" is = "+a);
    // System.out.println(b+" is = "+b);



    //Que>> 1️⃣4️⃣ WAJP to accept any number and ask for what you want?? ⬇️👍
    // Scanner ob = new Scanner(System.in);
    //     System.out.print("Please enter 1st number :- ");
	// int num1=ob.nextInt();
	// System.out.print("Please enter 2nd number :- ");
	// int num2=ob.nextInt();
	// System.out.print("what do you want?? For addition press 1, for multiple press 2, for substraction press 3 :- ");
	// int num3=ob.nextInt();
	// switch(num3){
	// 	case 1:
	// 		System.out.println("Your addition is :- "+(num1+num2));
	// 		break;
	// 	case 2:
	// 		System.out.println("Your multiplication is :- "+(num1*num2));
	// 		break;
	// 	case 3:
	// 		System.out.println("Your substraction is :- "+(num1-num2));
	// 		break;
	// 	default:
	// 	System.out.println("Please enter any number for operation");
	// }



    //Que>> 1️⃣3️⃣ WAJP in java to enter a sentence. Frame a word by joining all the first characters??⬇️👍
    //  of each word od the sentence. Display the word.
    // Simple input : Vital Information Resource under seize
    // Sample output : VIRUS
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a sentence :- ");
    // String str = sc.nextLine();
    // String word = ""+str.charAt(0);
    // int len=str.length();
    //     for(int i=0;i<len;i++){
    //         char ch=str.charAt(i);
    //         if(ch==' ')
    //             word+=str.charAt(i+1);
    //     }
    //     System.out.println(word);


    
    //Que>> 1️⃣2️⃣ WAJP to accept any key and display their ASCILL values??⬇️👍
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter any key for ASCILL values :- ");
    // String word = sc.nextLine();
    // int length=word.length();
    //     for(int i=0;i<length;i++){
    //         char chr = word.charAt(i);
    //         System.out.println("ASCILL value of "+chr+" = "+(int)chr);
    //     }


    
    //Que>> 1️⃣1️⃣ WAJP to display ⬇️👍
        //output    *
        //        * * *
        //      * * * * *
        //    * * * * * * *
        //  * * * * * * * * *
    // int num;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter you number for :- ");
    // num = sc.nextInt();
    //     for(int i=1;i<=num;i++){
    //             for(int j=i;j<=num;j++){
    //                 System.out.print("  ");
    //             }
    //             for(int k=1;k<i;k++){
    //                 System.out.print("* ");
    //             }
    //             for(int l=1;l<=i;l++){
    //                 System.out.print("* ");
    //             }
    //         System.out.println();
    //     }

    

    //Que>> 1️⃣0️⃣ WAJP to display ⬇️👍
        //output     *
        //         * *
        //       * * *
        //     * * * *
        //   * * * * *
    // int num;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter you number for :- ");
    // num = sc.nextInt();
    //     for(int i=1;i<num;i++){
    //         for(int j=i;j<=num;j++){
    //             System.out.print("  ");
    //         }
    //         for(int k=1;k<=i;k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }



    //Que>> 9️⃣ WAJP to display ⬇️👍
        //output *
        //       * *
        //       * * *
        //       * * * *
        //       * * * * * 
    // int num;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter you number for :- ");
    // num = sc.nextInt();
    //     for(int i=1;i<=num;i++){
    //             for(int j=1;j<=i;j++){
    //                 System.out.print("* ");
    //             }
    //         System.out.println();
    //     }



    //Que>> 8️⃣ WAJP of prefix and postfix form - example??⬇️
    // int a,b;
    // a=10;
    // b=a++ + a++ + a++ - a-- - a--;
    // System.out.println("a is "+a+" and b is "+b);



    //Que>> 7️⃣ WAJP to display percantage of 5 subject??⬇️👍
    // float num=0,total=0;
    // Scanner ob=new Scanner(System.in);
    // System.out.print("plz enetr marks for calculating percantage :- ");
    // num=ob.nextFloat();
    // float per=num*100/500;
    // System.out.println("Your percantage of marks "+num+" = "+per+"%");
    // total=num+((20/100f)*num);
    // System.out.println((20/100f));
    // System.out.println("After  20% adding = "+total);


    //Que>> 6️⃣ WAJP to find elec. bill by unit : 1-51=1rs, 51-150=2rs, 151-250=3rs, more than 251=5rs+20% GST??⬇️
    // Scanner sc=new Scanner(System.in);
    // float unit,total=0,total2=0,total3=0,total4=0;
    // int i,j,k,l;
    // System.out.print("plz enter your unit for bill :- ");
    // unit=sc.nextFloat();
    // if(unit<=50){   
    //     total=unit*1;
    //     System.out.println("Your bill of unit"+unit+" is = "+total+"Rs");
    // }else if(unit>=51 && unit<=150 ){ 
    //     for(i=1;i<=50;i++){
    //         total=i*1;
    //     }
    //     for(j=51;j<=unit;j++){
    //         total2=j-50;
    //     }
    //     total2=total2*2;
    //     total=total+total2;
    //     System.out.println("Your bill of unit "+unit+" is = "+total+"Rs");
    // }
    // else if(unit>=151 && unit<=250 ){  
    //     for(i=1;i<=50;i++){
    //         total=i*1;
    //     }
    //     for(j=51;j<=150;j++){
    //         total2=j-50;
    //     }
    //     for(k=151;k<=unit;k++){
    //         total3=k-150;
    //     }
    //     total2=total2*2;
    //     total3=total3*3;
    //     total=total+total2+total3;
    //     System.out.println("Your bill of unit "+unit+" is = "+total+"Rs");
    // }else{  
    //     for(i=1;i<=50;i++){
    //         total=i*1;
    //     }
    //     for(j=51;j<=150;j++){
    //         total2=j-50;
    //     }
    //     for(k=151;k<=250;k++){
    //         total3=k-150;
    //     }
    //     for(l=251;l<=unit;l++){
    //         total4=l-250;
    //     }
    //     total=total*1;
    //     total2=total2*2;
    //     total3=total3*3;
    //     total4=total4*5;
    //     total=total+total2+total3+total4;
    //     total=total+((20/100f)*total);
    //     System.out.println("Your bill of unit "+unit+" is = "+total+"Rs after adding 20% GST");
    // }



    // 5️⃣ WAJP to accept a year and check it's leap year or not??⬇️👍
    // int year;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Plz enter you year :- ");
    // year = sc.nextInt();
    //    if(year%4==0){
    //         if(year%400==0){
    //             if(year%400==0)
    //                 System.out.println(year+" is a leap yaer!");
    //             else
    //                 System.out.println(year+" is a not leap yaer!");
    //         }else
    //             System.out.println(year+" is a leap yaer!");
    //    }else
    //         System.out.println(year+" is not a leap yaer!");

    // 2️⃣ method
    // if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
    //     System.out.println(year+" is a leap yaer!");
    // }else if(year%100==0 && year%400!=0 || year%100!=0 && year%4!=0){
    //     System.out.println(year +" is not a leap year!");
    // }
    


    //Ques>> 4️⃣ print prime number from 2 to user input??⬇️👍
    // int num,i,j,rem=0;
    // System.out.print("plz enter range for checking :- ");
    // Scanner sc=new Scanner(System.in);
    // int range =sc.nextInt();
    // for(i=2;i<=range;i++)
    // {
    //     rem=0,num=i;
    //     for(j=2; j<num;j++){
    //             if(num%j==0)
    //             {
    //             rem=1;
    //                 }}
    //         if(rem==0)
    //         {
    //             System.out.print(" \t "+num);
    //         }
    //             // else{ System.out.print(num+" is prime not a number!"); }  
    // }




    //Ques>> 3️⃣ WAJP to check number is prime or not??⬇️👍
    // int num,i,rem=0;
    // System.out.print("plz enter number for checking :- ");
    // Scanner sc=new Scanner(System.in);
    // num=sc.nextInt();
    // //Logic
    //     for(i=1; i<=num;i++){
    //         if(num%i==0){
    //             rem++;
    //         }
    //     }
    // if(num==2){
    //     System.out.println(num+" is plindrome number!");
    // }else{
    //     System.out.println(num+" is plindrome not a number!"); 
    // }

    // 2️⃣ method
    // class TestPrime{
    //     public static void checkPrime(int a,int b){
    //         int flag=0;
    //         for (int i=2;i<a; i++){
    //             if(a%i==0){
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //         if(flag==0)
    //             System.out.print( a + " Is a prime Number");
    //         else
    //             System.out.print( a + " is not a prime number");
    //     }
    //     public static void main(String args[]){
    //         checkPrime(5,0);
    //         checkPrime(173,0);
    //     } }



    //Ques>> 2️⃣ WAJP to print table of any number and also ask for range??⬇️👍
    // Scanner sc=new Scanner(System.in);
    // System.out.print("enter number for table -->> ");
    // int number = sc.nextInt();
    // System.out.print("enter range of table -->> ");
    // int range = sc.nextInt();
    // if(number>0){
    //     for(int i=1;i<=range;i++)
    //     System.out.println(number +" * "+ i +" = "+(number*i));
    // }else{
    //     System.out.println("You've to enter a number for table"); 
    // }



    //Que>> 1️⃣ WAJP to print a greet message with taking your name??⬇️👍
    //String str ="Aayush"; System.out.print("Hellow! "+str+" Have a good day.");



    //Que>> ❗❗ Example of data types??⬇️👍
    // float b=23.56f;
    // char c='x';
    // double d=43.65d;
    // long l=1234;
    // byte byt=23;
    // short sht=1234;
    // String str="rouank singh";
    // Scanner ob=new Scanner(System.in);
    // System.out.print("Enter Int value:-");
    // a=ob.nextInt();
    // System.out.print("Enter Float value:-");
    // b=ob.nextFloat();
    // System.out.print("Enter double:-");
    // d=ob.nextDouble();
    // System.out.print("Enter long value:-");
    // l=ob.nextLong();
    // System.out.print("Enter byte value:-");
    // byt=ob.nextByte();
    // System.out.print("Enter short value:-");
    // sht=ob.nextShort();
    // System.out.print("Enter String:-");
    // str=ob.nextLine();
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(l);
    // System.out.println(byt);
    // System.out.println(sht);
    // System.out.println(str);
    // int a=1;

}
}
