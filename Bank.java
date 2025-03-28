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
		bank.start();
	} // End main
	public Bank(){
		loadSampleCustomers();
		// saveCustomers();
		// loadCustomers();
		// saveCustomers();
	} // End constructor
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
				loginAsCustomer();
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
				fullCustomerReport();
			} // End if
			if(input.equals("2")){
				correct = true;
				addCustomer();
			} // End if
			if(input.equals("3")){
				correct = true;
				applyInterest();
			} // End if
			if(correct == false){
				System.out.println("Invalid input.");
			} // End validation if
		} // End while
	} // End adminStart
	public void loadSampleCustomers(){
		Customer alice = new Customer("Alice", "1111");
		customers.add(alice);
		Customer bob = new Customer("Bob", "2222");
		customers.add(bob);
		Customer cindy = new Customer("Cindy", "3333");
		customers.add(cindy);
	} // End sample
	public void loginAsCustomer(){
		System.out.println("");
		System.out.println("Enter your username: ");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		System.out.println("Enter your PIN: ");
		String pinInput = input.nextLine();
		System.out.println(userInput + " " + pinInput);
		Customer currentCustomer = null;
		for(Customer customer: customers){
			Boolean custTest = customer.login(userInput, pinInput);
			if(custTest == true){
				currentCustomer = customer;
				currentCustomer.start();
			} // End if
		} // End for
		if(currentCustomer == null){
			System.out.println("Customer not found!");
		} // End if
	} // End login as customer
	public void fullCustomerReport(){
		for(Customer customer: customers){
			String report = customer.getReport();
			System.out.println(report);
		} // End for
		System.out.println(" ");
	} // End full customer report
	public void addCustomer(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username for new customer: ");
		String tempUserName = input.nextLine();
		System.out.println("Enter PIN for new customer: ");
		String tempPIN = input.nextLine();
		Customer customer = new Customer(tempUserName, tempPIN);
		customers.add(customer);
	} // End add customer
	public void applyInterest(){
		for(Customer customer: customers){
			customer.savings.calcInterest();
		} // End for
	} // End apply interest
	public void saveCustomers(){

	} // End saveCustomers
	public void loadCustomers(){

	} // End loadCustomers
} // End bank

class CustomerList extends ArrayList<Customer>{
	
} // End wrapper class
