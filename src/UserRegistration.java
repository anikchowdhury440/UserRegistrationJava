import java.util.Scanner;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	
	public void inputFirstName() {
		while(true) {
			System.out.println("Enter Your FirstName: ");
			String firstName = scanner.nextLine();
			if (checkName(firstName) == true) {
				break;
			}
			else {
	        	System.out.println("First Name is Invalid. Starts with Caps and minimum 3 Characters");
			}
		}
	}
	
	public void inputLastName() {
		while(true) {
			System.out.println("Enter Your LastName: ");
			String lastName = scanner.nextLine();
			if (checkName(lastName) == true) {
				break;
			}
			else {
	        	System.out.println("Last Name is Invalid. Starts with Caps and minimum 3 Characters");
			}
		}
	}
	
	public boolean checkName(String name) {
		return (name.matches(NAME_PATTERN));
	}
	
	public void getUser() {
		inputFirstName();
		inputLastName();
	}

	public static void main(String[] args) {	
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.getUser();
	}
}
