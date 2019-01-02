/**
 * 
 * @author Daniel Han
 * Pd. 7
 */

public class SavingsAccount extends BankAccount
{
	private double intRate;
	final double MIN_BAL;
	final double MIN_BAL_FEE;
	
	public SavingsAccount(String n, double b, double r, double mb, double mbf)
	{
		super (n, b);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	public SavingsAccount(String n, double r, double mb, double mbf)
	{
		super (n);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	public void deposit (double amt)
	{
		if (amt < 0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			super.deposit(amt);
		}
	}
	public void withdraw (double amt)
	{
		if (amt>getBalance())
		{
			throw new IllegalArgumentException();
		}
		if (amt<0)
		{
			throw new IllegalArgumentException();
		}
		super.withdraw(amt);
		if (getBalance() < MIN_BAL)
		{
			super.withdraw(MIN_BAL_FEE);
		}
	}
	public void transfer (BankAccount other, double amt)
	{
		if (!getName().equals(other.getName()))
		{
			throw new IllegalArgumentException();
		}
		if (amt>getBalance())
		{
			throw new IllegalArgumentException();
		}
		if (amt<0)
		{
			throw new IllegalArgumentException();
		}
		super.transfer(other, amt);
	}
	public void addInterest()
	{
		super.deposit((intRate) * getBalance());
	}
	public void endOfMonthUpdate()
	{
		addInterest();
	}
}
