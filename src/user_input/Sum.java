package user_input;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanneromy= new Scanner(System.in);
				System.out.println("Enter your first number");
				int a= Integer.parseInt(scanneromy.nextLine());

				System.out.println("Enter your second number");
				int b= Integer.parseInt(scanneromy.nextLine());
				System.out.println(a+b);

	}

}
