//Questions 📘📘 Write a program to display use of string class??
// Import java.util.Scanner; 
// class StringPrg {
//      public static void main(String args[]) { 
//           Scanner sc=new Scanner(System.in); 
//           String ob1=new String("Rounak Kr. Singh"); 
//           String ob2="Faculty of BCA,SNSRKS, College, Saharsa"; 
//           String ob3=new String(); 
//           System.out.print("Enter a string :"); ob3=sc.nextLine(); 
//           System.out.println("value of ob1 \t" +ob1); 
//           System.out.println("value of ob2 \t" +ob2); System.out.println("value of ob3 \t" +ob3); 
//      }
// } 



//Questions 📘📘 WAP to accept a string and display it’s all element one by one??
// import java.util.Scanner; 
// class StringPrg { 
//      public static void main(String args[]) { 
//           Scanner sc=new Scanner(System.in); 
//           String ob1=new String(); 
//           System.out.print("Enter a String To print it\'s all element one by one :"); ob1=sc.nextLine(); int l=ob1.length(); 
//           //System.out.println("Starting index " + ob1.indexOf('R')); 
//           //System.out.println("Length of string " + ob1.length()); 

//           for(int i=0;i<l;i++) { 
//                System.out.println((i+1)+"\t Element of Givern Sting is :\t" + ob1.charAt(i)); 
//           } 
//      } 
// } 



//Questions 📘📘 WAP to accept a string, then accept index from where user want to see character. 
// import java.util.Scanner; 
// class StringPrg { 
// public static void main(String args[]) { 
//           Scanner sc=new Scanner(System.in); 
//           String ob1=new String(); System.out.print("Enter a String "); ob1=sc.nextLine(); 
//           System.out.print("Enter index value from you want to display char"); int i=sc.nextInt(); 
//           System.out.println("\t Data on given index is :" + ob1.charAt(i)); 
//      } 
// } 
 

//Questions 📘📘 WAP TO accept a string and display all vowel with its index position.  
// import java.util.Scanner; 
// class StringPrg { 
//      public static void main(String args[]) { 
//           Scanner sc = new Scanner(System.in); 
//           String ob1 = new String(); 
//           System.out.print("Enter a String to display all vowel with their index position\t:\t "); 
//           ob1 = sc.nextLine(); 
//           String cob1 = new String(ob1); 
//           ob1 = cob1.toLowerCase(); 
//           int last = ob1.length(); 
//           for(int i=0;i<last;i++) { 
//                if(ob1.charAt(i)=='a' || ob1.charAt(i)=='e' ||ob1.charAt(i)=='i' ||ob1.charAt(i)=='o' ||ob1.charAt(i)=='u' ) 
//                System.out.println("A vowel Charactor is founded on index " + i + "and it is"  +ob1.charAt(i));  
//           } 
//      } 
// } 


//Questions 📘📘 WAP to accept first name, last name of student and store it in full name and display it??
// import java.util.Scanner; 
// class StringPrg { 
// public static void main(String args[]) { 
//           Scanner sc=new Scanner(System.in); 
//           String ob1,ob2,ob3; 
//           System.out.print("Enter First Name :"); ob1=sc.nextLine(); 
//           System.out.print("Enter Last Name :"); ob2=sc.nextLine(); //full name ob3=ob1.concat(ob2); 
//           System.out.print("first name : "+ob1 + "\n Last Name :"+ob2+ "\n Full Name :"+ ob3); 
//      } 
// } 



//Questions 📘📘 WAP to accept a string and check it is palindrome or not. 
//Questions 📘📘 WAP to accept a string and change its case to upper, lower and display it. 
//Questions 📘📘 WAP to accept full name and after that accept last name to change their last name, then display it. 
//Questions 📘📘 WAP to accept a string. Then string for search in given string, then display its staring position if it is founded.