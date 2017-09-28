package conditional_statements;

import java.util.Scanner;

import utils.Util;

public class IfExamples {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Util util = new Util();
		
		//even odd 
		int a = sc.nextInt();
		String s = util.evenOdd(a);
		System.out.println(s);
		
		
	}

}
