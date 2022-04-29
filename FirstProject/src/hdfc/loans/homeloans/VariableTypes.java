package hdfc.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x = 100; // instance (or) instance-global (or) non-static
	static String str = "vmware"; // static (or) static-global
	static VariableTypes obj = new VariableTypes();

	public void m1()
	{
		int x = 200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.str);
	}
	
	public static void m2()
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.str);
	}
	
	public static void main(String[] args) 
	{
		//VariableTypes obj = new VariableTypes();// non-primitive / reference
		System.out.println(obj.x);
		System.out.println(VariableTypes.str);
	}

}
