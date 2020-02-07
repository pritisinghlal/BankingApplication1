package com.mybankingapp;

import java.util.Scanner;

public class SavingAccount implements Bank{
	
	 private  float amount;
	   private float balance;
	private float initial_deposit;
	private float min_balance;
	
	public SavingAccount(float amount, float balance, float initial_deposit,float min_balance) {
		super();
		this.amount = amount;
		this.balance = balance;
		this.initial_deposit = initial_deposit;
		this.min_balance = min_balance;
		
	}
	

	@Override
	public String toString() {
		return "SavingAccount [amount=" + amount + ", balance=" + balance + ", initial_deposit=" + initial_deposit
				+ ", min_balance=" + min_balance + "]";
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
//	        if(initial_deposit>2000 && min_balance==2000)
//	    		balance = balance - amount;
//	    		else {
//	    			System.out.println("Please maintain minimum balance of $2000");
//	    		}
		
	}
	@Override
	public void transferFund() {

		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter the amount to tarnsfer:");
		amount = input.nextInt();
		if (balance < amount) {
			System.out.println("Not sufficient balance.");
			
		}
		if (amount < 0) {
			System.out.println("Invalid Amount");
			
		}
		
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
	public void provideStatement() {
		balance = balance-amount;
		System.out.println("Balance"+balance);
	}

}
