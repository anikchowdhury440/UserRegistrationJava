import java.util.Scanner;

public class UserRegistration {
	
	Scanner scanner = new Scanner(System.in);
	
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9A-Za-z]+)*@[0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public static final String MOBILE_PATTERN = "^[0-9]{1,2}[ ][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "^[0-9a-zA-Z]{8,}$";
	
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
	
	public void inputEmail() {
		while(true) {
			System.out.println("Enter Your Email: ");
			String email = scanner.nextLine();
			if (checkEmail(email) == true) {
				break;
			}
			else {
				System.out.println("Email is Invalid");
			}
		}
	}
	
	public void inputMobile( ) {
		while(true) {
			System.out.println("Enter Your Mobile Number: ");
			String mobile = scanner.nextLine();
			if (checkMobile(mobile) == true) {
				break;
			}
			else {
				System.out.println("Mobile Number is Invalid. Enter Country code followed by space and 10 digit number");
			}
		}
	}
	
	public void inputPassword() {
		while(true) {
			System.out.println("Enter Password: ");
			String password = scanner.nextLine();
			if (checkPassword(password) == true) {
				break;
			}
			else {
				System.out.println("Password is Invalid. Enter minimum 8 characters");
			}
		}
	}
	
	public boolean checkName(String name) {
		return (name.matches(NAME_PATTERN));
	}
	
	public boolean checkEmail(String email) {
		return(email.matches(EMAIL_PATTERN));
	}
	
	public boolean checkMobile(String mobile) {
		return(mobile.matches(MOBILE_PATTERN));
	}
	
	public boolean checkPassword(String password) {
		return(password.matches(PASSWORD_PATTERN));
	}
	
	public void getUser() {
		inputFirstName();
		inputLastName();
		inputEmail();
		inputMobile();
		inputPassword();
	}

	public static void main(String[] args) {	
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.getUser();
	}
}
