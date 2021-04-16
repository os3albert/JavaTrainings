
public class Menu {
	
	private String name;
	private String password;
	private String error;
	
	
	
	/**
	 * @param name
	 * @param password
	 */
	public Menu(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public void openAccount() {
		
	}
	
	public void logInExistAccount(String name, String password) {
		this.error = "Access Deny";
		if (this.name == name && this.password == password) {
			this.error = "Welcome!";
		}
	}
	
	public String help(String needHelp) {
		String help = "for more contact us";
		switch(needHelp) {
		case "problem password":
			help = "automatic answer for password problems";
			break;
		case "user name":
			help = "automatic answer for user name problems";
			break;
		case "email verification":
			help = "automatic answer for email verification problems";
			break;
		case "code referral":
			help = "automatic answer for code referral problems";
			break;
		default :
			break;
		}
		
		return help;
	}
	
	public void Quit() {
		
		this.name = "";
		this.password = "";
		
		System.out.println("Goodbye");
		
	}

}
