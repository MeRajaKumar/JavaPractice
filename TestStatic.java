class Stu {
	String nm; //properties
	public Stu() //constractor
		{
			nm ="no name";
		}
	public void getData() //function
		{
			System.out.print("Get Data Called");
		}
	public static void  showData() //function
		{
		System.out.print("show Data Called");
		}

	{	//non-tatic method
		System.out.print(" Non Static called\n");
	}
	static //static method
	{
		System.out.print("Static called\n");
	}
}
class TestStatic
{
	public static void show()
	{	
	System.out.print("show called");
	}
	public static void main(String args[])
	{
       Stu ob1=new Stu();
       Stu ob2=new Stu();
       Stu ob3=new Stu();
       Stu ob4=new Stu();
		ob1.showData();
		Stu.showData();
		ob1.getData();
		Stu.getData();
		show();
	}
}