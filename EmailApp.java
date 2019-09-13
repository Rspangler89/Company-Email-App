import emailapp.Email; // import emailapp.Email
import java.util.Scanner; // import Scanner

public class EmailApp 
{
	// Variables for employees name.
	private String fName; 
	private String lName;

	public static void main(String[] args)
	{
		// Prompt user to enter new employees name. 
		System.out.print("\nPlease enter new employees first name: ");
    	Scanner sc = new Scanner(System.in);
    	String fName = sc.nextLine();
        System.out.print("Please enter new employees last name: ");
    	String lName = sc.nextLine();

        // passes first and last name to constructor in emailapp package.
		Email em1 = new Email(fName, lName); 

		// Outputs info after email is created in emailapp package.
		System.out.println(em1.showInfo()); 
	}
}