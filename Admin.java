// Step 1 of week 2: get admin administrating

import java.util.*;

public class Admin extends User implements HasMenu{
	// Data
	protected String userName;
	protected String PIN;

	// Methods
	public Admin(){
		setUserName("admin");
		setPIN("0000");
	}
	public String getReport(){
		String adminReport = "Admin: " + this.userName + " PIN: " + this.PIN;
		return adminReport;
	}
	public void start(){

	}
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Admin menu");
		System.out.println("0) exit");
		System.out.println("1) full customer report");
		System.out.println("2) add user");
		System.out.println("3) apply interest");
		String userInput = input.nextLine();
		return userInput;
	}
}
