package com.mybankingapp;

import java.io.Serializable;

//Here we need to create a method for customer information 

public class CustomerInformation implements Serializable {
	int cutomer_account_number;
	String customer_full_name;
	int customer_age;
	String customer_address;
	int contact_details;
	boolean customer_Id;
	public CustomerInformation(int cutomer_account_number,String customer_full_name, int customer_age, String customer_address,
			int contact_details) {
		super();
		this.cutomer_account_number=cutomer_account_number;
		this.customer_full_name = customer_full_name;
		this.customer_age = customer_age;
		this.customer_address = customer_address;
		this.contact_details = contact_details;
		//this.customer_Id = b;
	}
	@Override
	public String toString() {
		return "CustomerInformation [cutomer_account_number=" + cutomer_account_number + ", customer_full_name="
				+ customer_full_name + ", customer_age=" + customer_age + ", customer_address=" + customer_address
				+ ", contact_details=" + contact_details + ", customer_Id=" + customer_Id + "]";
	}
	
	//		System.out.println("Please choose the Account type ");
	//		System.out.println("1 : For Saving Account ");
	//		System.out.println("2 : For Checking Account ");
	//		System.out.println("3 : For Current Account ");
	
//	public  boolean CustomerInformation() {
//		
//		if(customer_age<18) {
//			System.out.println("You are not eligible to open the account!");
//		return false;
//		}
//		return true;
//	}
	
	
//	public boolean isSalaried() {
//		return customer_Id;
//		
//	}
//	
//	public boolean isRetired() {
//		return customer_Id;
//		}
//	public boolean isBusinessman() {
//		return customer_Id;
//		
//	}
	
}
