package emailapp; // Sets up emailapp package

import java.util.Scanner; // import Scanner

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "rasCompany.com";

	// Constructor with perameters to recieve the first name and last name from EmailApp file.
	public Email(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department
        this.department = setDepartment();

        // Call a method that returns a random password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nYour password is: " + this.password);

        // Combine elements to generate email.
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() +
         "@" + department + "." + companySuffix;
	}

	// Ask for the department.
    private String setDepartment()
    {
    	System.out.print("\nNew Employee: " + firstName + 
    		"\nDepartment codes:\n1 for Sales\n2 for Developement" +
    		"\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else {return "";}
    }

	// Generate a random password.
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Method to display info.
	public String showInfo() 
	{
		return "EMPLOYEE NAME: " + firstName + " " + lastName +
		"\nCOMPANY EMAIL: " + email +
		"\nMAILBOX CAPACITY: " + mailboxCapacity + " MB";

	}

}