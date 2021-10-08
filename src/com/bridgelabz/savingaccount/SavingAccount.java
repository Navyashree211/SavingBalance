package com.bridgelabz.savingaccount;

public class SavingAccount {   
	static private double annualInterestRate;
	private double savingBalance;
	
	public SavingAccount(double savingBalance)  {
		this.savingBalance = savingBalance;	}

	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	//set annual interest rate to a new values.
	public static void modifyInterestRate(double newInterestRate)  {
		annualInterestRate = newInterestRate;	
		}
	//method calculate monthly interest
	public void calculateMonthlyInterest()  {
		double monthlyI;
		monthlyI = (double) (this.savingBalance*annualInterestRate/12);
		this.savingBalance += monthlyI;
	}
	
	public static void main(String[] args)  {  
		SavingAccount saver1, saver2;           // here I creat 2 object for saving account
		saver1 = new SavingAccount (2000.0);
		saver2 = new SavingAccount (3000.0);
		int total = 0;
		
		SavingAccount.modifyInterestRate(0.04);  
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("New Balance for saver1 in month: \nsaver1 balance = "+ saver1.getSavingBalance());
		System.out.println("New Balance for saver2 in month: \nsaver2 balance = "+ saver2.getSavingBalance()); 
		
		SavingAccount.modifyInterestRate(0.05);  
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Next month Balance for saver1 in month: \nsaver1 balance = "+ saver1.getSavingBalance());
		System.out.println("New next month Balance for saver2 in month: \nsaver2 balance = "+ saver2.getSavingBalance());
	}

}
