// Abstract user class wahoo

abstract class User implements HasMenu{
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
			if(this.PIN.equals(userPINInput)){
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

	public Boolean login(String userName2, String PIN2){
		if(userName.equals(userName2)){
			if(PIN.equals(PIN2)){
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

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setPIN(String pin){
		if(pin.matches("^\\d{4}$")){
			this.PIN = pin;
		} else {
			System.out.println("PIN must be four numeric digits.");
			System.out.println("Setting PIN to '0000'");
			this.PIN = "0000";
		} // End if/else
	} // End setPIN

	public String getPIN(){
		return PIN;
	} // End getPIN

	abstract String getReport();
} // End user
