/**
 * 
 * @author Daniel Han
 * Pd. 7
 */
public class SavingsAccount extends BankAccount
{
	//fields
	private double intRate;

	private final double MIN_BAL;
	private final double MIN_BAL_FEE;
	
	//Constructors
	public SavingsAccount(String n, double b, double r, double mb, double mbf)
	{
		super(n, b);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	public SavingsAccount(String n, double r, double mb, double mbf)
	{
		super(n);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;	
	}
	public void withdraw(double amt)
	{
		if(amt < 0)
		{
			throw new IllegalArgumentException();
		}
		if(getBalance() < 0)
		{
			throw new IllegalArgumentException();
		}
		else if (getBalance() - amt < MIN_BAL)
		{
			amt-= MIN_BAL_FEE;
			super.withdraw(amt);
		}
	}
	public void transfer(BankAccount other, double amt)
	{
		if ((other.getName()).equals(getName()))
		{
			if(getBalance() - amt < 0)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				super.transfer(other, amt);
			}
		}
	}
	public void addInterest()
	{
		super.deposit(intRate * getBalance());
	}
	
	
	public void endofMonthupdate() 
	{
		addInterest();
	}
}
