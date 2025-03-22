// Last class of week 1 atm!

import java.util.*;

public class Customer extends User{
	// Data
	protected CheckingAccount checking;
	protected SavingsAccount savings;

	// Methods
	public static void main(String[] args){
		Customer cus = new Customer();
	} // End main

	public Customer(){
		checking = new CheckingAccount();
		savings = new SavingsAccount();
		// For testing
		setUserName("Alice");
		setPIN("1111");
		start();
	} // End constructor (no parameters)

	public Customer(String userName, String PIN){
		checking = new CheckingAccount();
		savings = new SavingsAccount();
		setUserName(userName);
		setPIN(PIN);
	} // End constructor (parameters))
	
	public void start(){
		Boolean keepGoing = true;
		while(keepGoing == true){
			// Ask user for 0 or 1 for exit or login (for testing)
			System.out.print("Enter 0 to exit or 1 to login");
			Scanner input = new Scanner(System.in);
			String userInput = input.nextLine();
			if(userInput.equals("0")){
				keepGoing = false;
			} // End if
			if(userInput.equals("1")){
				Boolean keepGoing2 = true;
				Boolean userTest = login();
				if(userTest == false){
					keepGoing2 = false;
				} // End if

				// Actual while loop inside temp while loop
				while(keepGoing2 == true){
					String userIn = menu();
					if(userIn.equals("0")){
						keepGoing2 = false;
					} // End if
					if(userIn.equals("1")){
						checking.start();
					} // End if
					if(userIn.equals("2")){
						savings.start();
					} // End if
					if(userIn.equals("3")){
						changePin();
					} // End if
					if(userIn.equals("4")){
						String report = getReport();
						System.out.println(report);						
					} // End if
				} // End while 2
			} // End if
		} // End while temp
	} // End start

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Welcome valued customer!");
		System.out.println("0) Exit");
		System.out.println("1) Checking account");
		System.out.println("2) Savings account");
		System.out.println("3) Change PIN");
		System.out.println("4) Get report");
		String userInput = input.nextLine();
		return userInput;
	} // End menu

	public void changePin(){
		System.out.println("");
		System.out.println("Enter a four digit number for your new PIN: ");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		setPIN(userInput);
	} // End changePin

	public String getReport(){
		String checkBal = checking.getBalanceString();
		String saveBal = savings.getBalanceString();
		return "User: "+ this.userName + " Checking: " + checkBal + " Savings: " + saveBal;
	} // End getReport
} // End customer
