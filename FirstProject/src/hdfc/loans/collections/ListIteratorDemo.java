package hdfc.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("kiran");
		a.add("vamsi");
		a.add("ravi");
		a.add("sai");
		
		System.out.println(a);
		
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("ravi"))
				val.set("ravikanthlella");
			else
				val.remove();
		}
		
		System.out.println(a);
	}

}
