package user_input;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scannerobj=new Scanner(System.in);
 System.out.println("Enter your first number:");
 int a = Integer.parseInt(scannerobj.nextLine());
 System.out.println("Enter your second number:");
 int b = Integer.parseInt(scannerobj.nextLine());
 System.out.println(a*b); 
 
	}

}
