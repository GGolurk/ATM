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
				checkBalance();
			} // End if
			if(input.equals("2")){
				makeDeposit();
			} // End if
			if(input.equals("3")){
				makeWithdrawl();
			} // End if
		} // End while
	} // End start

	public double getBalance(){
		return balance;
	} // End getBalance

	public String getBalanceString(){
		// I am very glad I took a picture of String.format...
		String balString = String.format("$%.02f", this.balance);
		return balString;
	} // End getBalanceString

	public void setBalance(double balance){
		this.balance = balance;
	} // End setBalance

	public void checkBalance(){
		String bal = getBalanceString();
		System.out.println(bal);
	} // End checkBalance

	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		try{
			double tempBalance = Double.parseDouble(userInput);
			return tempBalance;
		} catch (Exception e) {
			System.out.print("Invalid input. Changing to 0. ");
		}
		return 0d;
	} // End getDouble

	public void makeDeposit(){
		System.out.println("");
		System.out.println("How much would you like to deposit?");
		Double deposit = getDouble();
		this.balance += deposit;
		String newBal = getBalanceString();
		System.out.println("Your new balance is " + newBal);
	} // End makeDeposit

	public void makeWithdrawl(){
		System.out.println("");
		System.out.println("How much would you like to withdraw?");
		Double withdrawl = getDouble();
		if(withdrawl > this.balance){
			System.out.println("You cannot withdraw more money than you have in your account.");
		} else {
			this.balance -= withdrawl;
		}
		String newBal = getBalanceString();
		System.out.println("Your new balance is " + newBal);
	} // End makeWithdrawl
} // End class
