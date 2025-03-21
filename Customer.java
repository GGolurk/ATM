// Last class of week 1 atm!

import java.util.*;

public class Customer extends User{
	// Data
	protected CheckingAccount checking;
	protected SavingsAccount savings;

	// Methods
	public static void main(String[] args){
		start();	
	} // End main

	public Customer(){
		// For testing
		setUserName("Alice");
		setPIN("1111");
	} // End constructor (no parameters)

	public Customer(userName, PIN){
		setUserName(userName);
		setPIN(PIN);
	} // End constructor (parameters))

	void start(){
		Boolean keepGoing = true;
		while(keepGoing == true){
			// Ask user for 0 or 1 for exit or login (for testing)
			keepGoing = false;
		} // End while
	} // End start

	String menu(){
		Scanner input = new Scanner(System.in);
		println("");
		println("Welcome valued customer!");
		println("0) Exit");
		println("1) Checking account");
		println("2) Savings account");
		println("3) Change PIN");
		println("4) Get report");
		userInput = input.nextLine();
		return userInput();
	} // End menu

	void changePin(){

	} // End changePin

	String getReport(){

	} // End getReport
} // End customer
