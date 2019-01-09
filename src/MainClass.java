
import java.util.ArrayList;

import java.util.Scanner;
/**
 * 
 * @author Daniel Han
 * PD 7
 */
public class MainClass //you need a break (the last line of every case)
{
	private static boolean isNumeric (String str)
	{
		try
		{
			Double.parseDouble(str);
			return true;
		}
		catch (IllegalArgumentException e)
		{
			return false;
		}
	}
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
		double balance = 0;
		String initialBal = "";
		double initialBalDouble = 0;
		
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
					{
						System.out.println("What is your name?: ");
						String name = in.nextLine();
						System.out.println("Do you want to make an initial deposit?: (type y/n)");
						String choice = in.nextLine();
						if(!choice.equals("y") && !choice.equals("n") && !choice.equals("Y") && !choice.equals("N"))
						{
							System.out.println("Invalid response, please try again (y/n)");
							choice = in.nextLine();
						}
						if (choice.equals("y"));
						{
							System.out.println("How much would you like to deposit?:");
							initialBal = in.nextLine();
							isNumeric(initialBal);
							while(!isNumeric(initialBal))
							{
								System.out.println("Your transaction was not authorized.  Please enter a numerical value: ");
								initialBal = in.nextLine();
							}
						
						}
					}
					case "s":
					{
						System.out.println("What is your name?: ");
						String name = in.nextLine();
						System.out.println("Do you want to make an initial deposit?: (type y/n): ");
						String choice = in.nextLine();
						if(!choice.equals("y") && !choice.equals("n") && !choice.equals("Y") && !choice.equals("N"))
						{
							System.out.println("Invalid response, please try again (y/n)");
							choice = in.nextLine();
						}
						if(choice.equals("y"))
						{
							System.out.println("How much would you like to deposit?:");
							initialBal = in.nextLine();
							
							isNumeric(initialBal);
							while(!isNumeric(initialBal))
							{
								System.out.println("Your transaction was not authorized.  Please enter a numerical value: ");
								initialBal = in.nextLine();
							}
						}
						else if (choice.equals("n"))
						{
							initialBal="0";
							
							isNumeric(initialBal);
							while(!isNumeric(initialBal))
							{
								System.out.println("Your transaction was not authorized.  Please enter a numerical value: ");
								initialBal = in.nextLine();
							}
							
							double initialBalance = String.parseDouble(initialBal);
							
							balance= initialBalance + balance;
						}
						SavingsAccount account = new SavingsAccount(name, balance, RATE, MIN_BAL, MIN_BAL_FEE);
						accounts.add(account);
						
						break;
					}
					
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
		
		}
		
	
	
}
	}
}
