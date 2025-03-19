// Abstract user class wahoo

public class User implements HasMenu{
	protected String userName;
	protected String PIN;

	public Boolean login(){
		System.out.println("");
		System.out.println("Enter your username:");
		java.util.Scanner input = new java.util.Scanner(System.in);
		String userNameInput = input.nextLine();
		System.out.println("Enter your PIN:");
		String userPINInput = input.nextLine();
		if(this.userName.equals(userNameInput)){
			if(this.userPIN.equals(userPINInput)){
				return true;
			} else {
				System.out.println("Incorrect PIN. Have you tried '1111?'");
				return false;
			} // End if/else
		} else {
			System.out.println("Unknown user. Have you tried 'Alice?'");
			return false;
		} // End if/else
	} // End login

	public Boolean login(userName, PIN){
		if(this.userName.equals(userName)){{
			if(this.userPIN.equals(userPIN)){
				return true;
			} else {	
				System.out.println("Incorrect PIN.");
				return false;
			} // End if/else
		} else {
			System.out.println("Unknown user.");
			return false;
		} // End if/else
	} // End pre-input login

	public void setUserName(userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setPIN(PIN){
		this.PIN = PIN;
	}

	public String getPIN(){
		return PIN;
	} // End getPIN
} // End user
