package hdfc.loans.homeloans;

public class TypeCating 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8, char-2

		// 1-Liter ---> 500 ML  ---> There is no risk ---> Widening
		// 1-Liter ---> 1.5 ltr ---> There is a risk  ---> Narrowing
		
		//Type Casting from one primitive type to another primitive type
		float x = 10.5f;
		System.out.println(x);
		
		int y = (int)x;
		System.out.println(y);
		
		int p = 65;
		System.out.println(p);
		
		char q = (char)p;
		System.out.println(q);
		
		System.out.println("------------------------");
		//Type Casting from  one primitive type to corresponding wapperclass type
		
		int x1 = 10;
		System.out.println(x1);
		
		//Integer x2 = x1;
		Integer x2 = Integer.valueOf(x1);
		System.out.println(x2);
		
		float y1 = 12.34f;
		System.out.println(y1);
		
		Float y2 = Float.valueOf(y1);
		System.out.println(y2);
		
		System.out.println("------------------------");
		//Type Casting from  one wapperclass type to another wapperclass type
		
		String s1 = "200";
		String s2 = "300";
		
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		System.out.println(i1+i2);
	}

}
