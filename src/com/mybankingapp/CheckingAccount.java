package com.mybankingapp;

import java.util.Scanner;

public class CheckingAccount implements Bank{
	
	 private  float amount;
	   private float balance;
	
	
	public CheckingAccount(float amount, float balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return "SavingAccount [amount=" + amount + ", balance=" + balance + "]";
	}


	@Override
	public void transferFund() {

		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter amount to tarnsfer:");
		amount = input.nextInt();
		if (balance < amount) {
			System.out.println("Not sufficient balance.");
			
		}
		if (amount < 0) {
			System.out.println("Invalid Amount");
			
		}
		balance = balance - amount;

       
      
		
	}

	@Override
	public void withdrawFund() {
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Your Balance=" + balance);
			System.out.print("Enter amount to withdraw:");
			amount = input.nextInt();
			if (balance < amount) {
				System.out.println("Not sufficient balance.");
				
			}
			if (amount < 0) {
				System.out.println("Invalid Amount");
				
			}
			balance = balance - amount;
			
	}
	
		
	

	@Override
	public void depositeFund() {
		 System.out.print("Amount to deposit: ");
	   	 @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	        amount = in.nextFloat();

	        if (amount <= 0)

	             System.out.println("Can't deposit nonpositive amount.");

	        else {

	             balance += amount;

	             System.out.println("$" + amount + " has been deposited.");

	        }

		
	}

	@Override
	public void provideStatement() {
		// TODO Auto-generated method stub
		
	}

}
