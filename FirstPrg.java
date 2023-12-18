import java.util.*;

public class FirstPrg{
	public static void main(String arg[])
	{
		add(20,40);
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter row : - ");
		num=sc.nextInt();
		Pettern(num);

		System.out.print("Enter the number: ");  
		int num1=sc.nextInt();  
		//method calling  
		findEvenOdd(num1); 
		//reading value from user  
	}
		public static  void findEvenOdd(int num1){
		//method body  
		if(num1%2==0)   
		System.out.println(num1+" is even");   
		else   
		System.out.println(num1+" is odd"); 
		}
	
		public static  void add(int a,int b){
		System.out.print(a + "+" + b + "=" + (a+b));
		}

		public static void Pettern(int num){
			for(int i=1;i<=num;i++){
				for(int j=1;j<=num;j++){
					System.out.print("* ");
				}
			System.out.println();
		}
		}
	}
	