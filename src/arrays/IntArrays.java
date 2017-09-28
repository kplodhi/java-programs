package arrays;

public class IntArrays {
	public static void main(String args[]){
		int a[] = {1,2,3,4,5};
		int[] b = new int[10];
		b[0] = 10;
		b[4] = 50;
		b[9] = 100;
		
		for(int i : a){
			System.out.println(i);
		}
		for(int i : b){
			System.out.println(i);
		}
		
		for( int j=0, i=2; i<=20; i=i+2, j++){
			b[j] = i;
		}
	
		for(int j=3; j<=30; j=j+3){
		System.out.println(j);
		}
	}

}
