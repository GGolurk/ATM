// Checking account for customers.

import java.util.*;

public class CheckingAccount implements HasMenu{
	// What this entire class revolves around
	protected double balance;

	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // End main

	public CheckingAccount(){
		this.balance = 0d;
	} // End empty constructor

	public CheckingAccount(double balance){
		this.balance = balance;
	} // End filled constructor

	public String menu(){
		System.out.println("");
		System.out.println("Checking Account");
		System.out.println("0) Exit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a Deposit");
		System.out.println("3) Make a Withdrawl");
		// Hopefully this doesn't need to be cleared
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		return userInput;
	}

	public void start(){
		Boolean keepGoing = true;
		while(keepGoing == true){
			String input = menu();
			if(input.equals("0")){
				System.out.println("Exiting");
				keepGoing = false;
			} // End if
			if(input.equals("1")){
				System.out.println("Checking balance");
			} // End if
			if(input.equals("2")){
				System.out.println("Depositing");
			} // End if
			if(input.equals("3")){
				System.out.println("Withdrawing");
			} // End if
		} // End while
	} // End start

	public double getBalance(){
		return this.balance();
	} // End getBalance

	public String getBalanceString(){

	} // End getBalanceString

	public void setBalance(double balance){
		CheckingAccount.balance = balance;
	} // End setBalance

	public void checkBalance(){
		// Print current balance
	} // End checkBalance

	private double getDouble(){
		// Will be userful later
	} // End getDouble

	public void makeDeposit(){
		// Ask user how much they want to depoit
		// Add that to balance
	} // End makeDeposit

	public void makeWithdrawl(){
		// Ask user how much they want to withdraw
		// Subtract that from balance
	} // End makeWithdrawl
} // End class
