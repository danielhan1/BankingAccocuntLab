import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Daniel Han
 * PD 7
 */
public class MainClass
{
	public static void main(String[] args)
	{
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		int OVER_DRAFT_FEE = 15;
		double RATE = 0.0025;
		double TRANSACTION_FEE = 1.5;
		int MIN_BAL = 300;
		int MIN_BAL_FEE = 10;
		int FREE_TRANSACTIONS = 10;
		String method;
		Scanner in = new Scanner(System.in);
		method = in.next();
		{
		System.out.println("Do you want to add an account, make a transaction, or terminate this program?");
		in.nextLine();
		while(!method.equals("add an account") && !method.equals("make a transaction") && !method.equals("terminate this program") && !method.equals("Add an account") &&  !method.equals("Make a transaction") &&  !method.equals("Terminate this program"));
		{
			System.out.println("Invalid. Please try again");
			method = in.next();
			in.nextLine();
		}
		if(method.equals("add an account") && method.equals("Add an account"));
		}
	
	
	
}
}
