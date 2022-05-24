class Account
{
	private int id;
	private double balance;
	private double rate;
	
	public Account(int id, double balance, double rate)
	{
		this.id=id;
		this.balance=balance;
		this.rate=rate;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double bal)
	{
		balance += bal;
	}
	
	public void withdraw(double bal)
	{
		balance -= bal;
	}
	public double getMonthlyIntrest()
	{
		return ((rate/100)/12)* balance;
	} 	 
}

public class AccountHandler
{
	public static void main (String[] args) 
	{
		Account acc = new Account(1222,20000.00,4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("Balance:"+ acc.getBalance());
		System.out.println("Monthly Intrest:"+ acc.getMonthlyIntrest());
	} 
}

