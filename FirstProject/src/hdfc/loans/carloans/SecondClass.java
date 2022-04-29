package hdfc.loans.carloans;

public class SecondClass 
{
	// data Properties
	int a =10, b=20, c;
	
	// Behaviours
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " +  c);
		//System.out.println(a+b);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Ssub of A & B is : " + c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
				
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
	}

}
