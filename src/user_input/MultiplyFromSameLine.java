package user_input;

import java.util.Scanner;

public class MultiplyFromSameLine {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);
		sc.close();
	}
}