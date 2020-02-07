package com.mybankingapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Account1 {
	SavingAccount savingAccount;
	CheckingAccount checkingAccount;
	CurrentAccount currentAccount;
	//	CustomerInformation accountNumber, custome_Id;
	//	ProfessioInformation salaried,retired,businessman;
	//	
	//	public void display(SavingAccount savingAccount, CheckingAccount checkingAccount,CurrentAccount currentAccount,CustomerInformation accountNumber) {
	//
	//		System.out.println(savingAccount);
	//		System.out.println(checkingAccount);
	//		System.out.println(currentAccount);
	//	}
	//	
	public static void main(String args[]) throws ClassNotFoundException {

		SavingAccount savingAccount = new SavingAccount(1000, 2000, 2000,2000);
		CheckingAccount checkingAccount = new CheckingAccount(300, 410);
		CurrentAccount currentAccount =new CurrentAccount(200, 100);
		CustomerInformation accountNumber = new CustomerInformation(12345621, "PritiSingh", 28 ,"Maryland", 222333333); 
		boolean quit = false;
		@SuppressWarnings("resource")
		Scanner userChoice = new Scanner(System.in);
		System.out.println("Welcome to BFJD bank!!  ");
		//System.out.println(accountNumber);

		do {
			try {
				ObjectOutputStream os =new ObjectOutputStream(new FileOutputStream("File.txt"));
				os.writeObject(accountNumber);
				os.flush();
				os.close();

				ObjectInputStream oin = new ObjectInputStream(new FileInputStream("File.txt"));
				CustomerInformation e =(CustomerInformation)oin.readObject();
				System.out.println(e.cutomer_account_number);
				System.out.println(e.customer_full_name);
				System.out.println(e.customer_age);
				System.out.println(e.customer_address);
				System.out.println(e.contact_details);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("What BFJD bank can do for you ?");

			System.out.println("1. Deposit fund");

			System.out.println("2. Withdraw fund");

			System.out.println("3. Transfer Fund");

			System.out.print("Your choice, 0 to quit: ");

			int input = userChoice.nextInt();
			switch(input) {
			case 1:
				savingAccount.depositeFund();
				checkingAccount.depositeFund();
				currentAccount.depositeFund();
				break;

			case 2:
				savingAccount.withdrawFund();
				checkingAccount.withdrawFund();
				currentAccount.withdrawFund();
				break;

			case 3:
				savingAccount.transferFund();
				checkingAccount.transferFund();
				currentAccount.transferFund();

				break;
			}


		} while (!quit);

		System.out.println("Bye!");


	}
}




