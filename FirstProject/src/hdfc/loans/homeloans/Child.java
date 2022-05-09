package hdfc.loans.homeloans;

 class Parent
{
	public Number workHard()
	{
		System.out.println("Parent : Wakeup early, goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : Atmost care....");
	}
	
}

public class Child extends Parent
{
	
	public strictfp Number workHard()
	{
		System.out.println("Child : Wakeup anytime, goto movies...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.workHard();
		p.care();
		
		Child obj = new Child();
		obj.workHard();
		obj.care();
		obj.love();
	}
}
