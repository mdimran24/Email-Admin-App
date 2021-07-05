package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCap = 500;
	private String email;
	private String alternateEmail;
	private int passLimit = 8;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		setEmail();
		System.out.println("Your Email is: " + email);
		this.password = generatePass(passLimit);
		System.out.println("Your Generated Password is: " + this.password);
		
	}

	private String setDepartment() {
		System.out.print("Enter department: \n1: Sales \n2: Development \n3: Accounting \nAny Other Key: Other \n");
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()){
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {
			return "sales";
		} else if (deptChoice == 2) {
			return "dev";
		} else if (deptChoice == 3) {
			return "acc";
		} else {
			return "other";
		}
		}else {
			return "other";
		}
	}

	private String generatePass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!@*#";
		char[] password = new char[length];
		for(int i = 0; i< length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public void setAlternateEmail(String altEmail) {
		 alternateEmail = altEmail;
	}

	public void setEmail() {
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".company.com";
	}

	public int getMailboxCap() {
		return mailboxCap;
	}

	public void setMailboxCap(int mbc) {
		mailboxCap = mbc;
	}

	public String getFullName() {
		return firstName + lastName;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public String showInfo() {
		return "Profile:\n" + "Full Name: " + firstName + " " + lastName +
				"\nEmail: " +  email +
				"\nMailbox Capacity: " + mailboxCap;
	}
}
