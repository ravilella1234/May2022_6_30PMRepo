package hdfc.loans.carloans;

public class ICICI implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam withdrawl overridden in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam depossit overridden in ICICI");
	}
	
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

}
