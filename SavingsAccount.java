// Checking account took too long, hopefully savings is easier.

import java.io.*;

public class SavingsAccount extends CheckingAccount implements Serializable{
	protected double interestRate = 0.05d;
	protected static final long serialVersionUID = 1L;

	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	} // End main

	public void calcInterest(){
		this.balance += this.balance * interestRate;
	} // End calcInterest

	public void setInterestRate(){
		// I wanted to use getDouble here but it's private :(
		System.out.println("Enter a value to set the interest rate.");
		java.util.Scanner input = new java.util.Scanner(System.in);
		String userInput = input.nextLine();
		this.interestRate = Double.parseDouble(userInput);
		System.out.println("The new interest rate is " + interestRate);
	} // End setInterestRate

	public double getInterestRate(){
		return interestRate;
	} // End getInterestRate
} // End SavingsAccout
