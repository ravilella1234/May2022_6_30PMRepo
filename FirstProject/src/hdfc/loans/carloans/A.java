package hdfc.loans.carloans;

import java.util.Date;

public  class A 
{
	public  int x = 100;
	public static String  cname = "vmware";
	
	public void m1()
	{
		x=200;
		cname = "prolifics";
		System.out.println("iam m1 from A");
	}
	
	public static void m5()
	{
		System.out.println("iam static method m5");
	}
	
	static
	{
		System.out.println("iam static block");
	}
	
	static
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		m5();
		System.out.println(cname);
	}

}
