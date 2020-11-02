import java.util.Scanner;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	
	public void inputFirstName() {
		while(true) {
			System.out.println("Enter Your FirstName: ");
			String firstName = scanner.nextLine();
			if (checkFirstName(firstName) == true) {
				break;
			}
			else {
	        	System.out.println("First Name is Invalid. Starts with Caps and minimum 3 Characters");
			}
		}
	}
	
	public boolean checkFirstName(String fName) {
		return (fName.matches(FIRST_NAME_PATTERN));
	}
	
	public void getUser() {
		inputFirstName();
	}

	public static void main(String[] args) {	
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.getUser();
	}
}
