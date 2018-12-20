
public class CheckingAccount extends BankAccount
{
		final double OVER_DRAFT_FEE;
		final double TRANSACTION_FEE;
		final double FREE_TRANS;
		//fields
		int numTransactions;
		
		//Constructors
		public CheckingAccount(String n, double b, double odf, double tf, int freeTrans)
		{
		super(n, b);
			OVER_DRAFT_FEE = odf;
			FREE_TRANS = freeTrans;
			TRANSACTION_FEE = tf;
		}
		public CheckingAccount(String n, double odf, double tf, int freeTrans)
		{
			super(n);
			OVER_DRAFT_FEE = odf;
			FREE_TRANS = freeTrans;
			TRANSACTION_FEE = tf;
		}
		public void deposit(double amt)
		{
			if(amt <= 0)
			{
			throw new IllegalArgumentException();
			}
			else
			{
				numTransactions++;
				deposit(amt);
				//trans fee happens here
			}
		}
		public void withdraw(double amt)
		{
			if(amt <= 0)
			{
				
				throw new IllegalArgumentException();
			}
			if(getBalance() < 0)
			{
				throw new IllegalArgumentException();
			}
			
		}
		public void transfer(BankAccount other, double amt)
		{
		
			if ((other.getName()).equals(getName()))
			{	
				if(getBalance() - amt > 0);
				{
					super.transfer(other, amt);
				}
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		@Override
		public void endofMonthupdate() 
		{
			numTransactions = 0; 
		}
	}
