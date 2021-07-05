package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		System.out.println("Please Enter Your First Name: \n");
		Scanner in = new Scanner(System.in);
		String fn = in.next();
		System.out.println("Please Enter Your Last Name: \n");
		String ln = in.next();
		Email e = new Email(fn, ln);
		System.out.println(e.showInfo());
	}

}
