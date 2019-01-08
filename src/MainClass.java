import java.util.ArrayList;

import java.util.Scanner;
/**
 * 
 * @author Daniel Han
 * PD 7
 */
public class MainClass //you need a break (the last line of every case)
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
		System.out.println("Do you want to 'a' add an account, 'b' make a transaction, or 'c' terminate this program?");
		in.nextLine();
		while(!method.equals("a") && !method.equals("b") && !method.equals("c"));
		{
			System.out.println("Invalid. Please try again");
			method = in.next();
			in.nextLine();
		}
		switch (method) {
			case "a": 
				while (method.equals("a"))
				{
				System.out.println("Would you like to create 'c' a Checking account or 's' a Savings account?");
				method = in.next();
				in.nextLine();
					switch(method) {
					case "c":
							System.out.println("What would you like to name your account?");
							String name = in.next();
							System.out.println("Would you like to make an initial deposit? (y/n)");
							String decision = in.next();
							if (decision.equals("y"))
							{
								System.out.println("Please enter the amount you would like to deposit");
								double amt = in.nextDouble();
							}
							
					case "s":
						
					}
				}
			case "b":
				while (method.equals("b"))
				{
				System.out.println();
				}	 
			case "c":
			{
				System.out.println("Terminated");
			}
		{
			
		}
		}
		
	
	
}
	}
}
