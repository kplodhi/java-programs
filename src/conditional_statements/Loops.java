package conditional_statements;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		// take inputs from user and print square of the input. if input is zero exit.
		Scanner sc =new Scanner (System.in);
		int i= sc.nextInt();
		while (i!=0){
			System.out.println(i*i);
			i=sc.nextInt();
		}
		int[] a={1,2,3,0,5};
		for(int e : a){
			if(e==0){
				break;
			}
			System.out.println(Math.sqrt(e));
		}
		
	}

}
