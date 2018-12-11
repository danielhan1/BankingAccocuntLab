
public abstract class BankAccount
{
	//instance variables
	private String name;
	private int acctNum;
	private double balance;
	
	//constructors
	public BankAccount (String n)
	{
		this.name = n;
		//acctNum
		balance = 0;
	}
	public BankAccount (String n, double b)
	{
		this.name = n;
		//acctNum
		balance = b;
	}
	//methods
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	public void withdraw (double amt)
	{
		balance = balance - amt;
	}
	public String GetName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public abstract void endofMonthupdate();
	
	public void transfer(BankAccount other, double amt)
	{
		withdraw(amt);
		other.deposit(amt);
	}
	public String toString()
	{
		return acctNum + "\t" + name + "\t" + "$" + balance;
	}
}








