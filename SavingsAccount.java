// Checking account took too long, hopefully savings is easier.

public class SavingsAccount extends CheckingAccount {
	protected double interestRate = 0.05d;

	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
	}

	public void calcInterest(){
		this.balance *= interestRate;
	}

	public void setInterestRate(){
		// I wanted to use getDouble here but it's private :(
		System.out.println("Enter a value to set the interest rate.");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		this.interestRate = Double.parseDouble(userInput);
		System.out.println("The new interest rate is " + interestRate);
	}

	public double getInterestRate(){
		return interestRate;
	}
} // End SavingsAccout
