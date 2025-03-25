// The big stuff

import java.util.*;
import java.io.*;

public class Bank implements HasMenu{
	// Data
	Admin admin = new Admin();
	CustomerList customers = new CustomerList();

	// Methods
	public static void main(String[] args){
		Bank bank = new Bank();
		loadSampleCustomers();
		bank.start();
	} // End main
	public void start(){
		Boolean keepGoing = true;
		while(keepGoing == true){
			String input = menu();
			// Correct is here for input validation
			Boolean correct = false;
			if(input.equals("0")){
				correct = true;
				keepGoing = false;
			} // End if
			if(input.equals("1")){
				correct = true;
				Boolean adLog = admin.login();
				if(adLog == true){
					adminStart();
				} // End if
			} // End if
			if(input.equals("2")){
				correct = true;
				System.out.println("testing");
			} // End if
			if(correct == false){
				System.out.println("Invalid input. Exploding your computer.");
				keepGoing = false;
			} // End validation if
		} // End while
	} // End start
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Bank menu");
		System.out.println("0) exit");
		System.out.println("1) login as admin");
		System.out.println("2) login as customer");
		String userInput = input.nextLine();
		return userInput;
	} // End menu
	public void adminStart(){
		Boolean keepGoing = true;
		while(keepGoing == true){
			String input = admin.menu();
			// Correct for input validation
			Boolean correct = false;
			if(input.equals("0")){
				correct = true;
				keepGoing = false;
			} // End if
			if(input.equals("1")){
				correct = true;
				System.out.println("Making customer report...");
			} // End if
			if(input.equals("2")){
				correct = true;
				System.out.println("Adding a user...");
			} // End if
			if(input.equals("3")){
				correct = true;
				System.out.println("Applying interest...");
			} // End if
			if(correct == false){
				System.out.println("Invalid input.");
			} // End validation if
		} // End while
	} // End adminStart
	public void loadSampleCustomers(){
		Customer customer = new Customer("Alice", "1111");
		CustomerList.add(customer);
		Customer customer = new Customer("Bob", "2222");
		CustomerList.add(customer);
		Custoemr customer = new Customer("Cindy", "3333");
		CustomerList.add(customer);
	} // End sample
} // End bank

class CustomerList extends ArrayList<Customer>{
	
}
