package user_input;

import java.util.Scanner;

public class PrintDetails {

	public static void main(String[] args) {
		//taking input with Scanner
		Scanner scannerObj =new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = scannerObj.nextLine();
		System.out.println("Enter your date of birth : ");
		String dob = scannerObj.nextLine();
		System.out.println("Your name is : " + name + "\nYour date of birth is : " + dob);
		

	}

}
