package data_types;

public class Strings {
	public static void main(String a[]){
		Util obj=new Util();
		String s1="KP is a boy";
		String s2=new String("KP");
		String s3="KP is learning java";
		// concatenation 
		System.out.println(s1+s2);
		
		//Equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		// ==
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//number of words in a string
		System.out.println(obj.numberOfWords(s1));
		// how many times a has occurred in the string s3 ?
		int lengthBefore = s3.length();
		s3=s3.replaceAll("a", "");
		System.out.println(lengthBefore - s3.length());
		// to remove white spaces
		s1=s1.replaceAll(" ","");
		System.out.println(s1);
		//String is an array of characters
		char[] arrSample = {'R', 'O', 'S', 'E'};
		//String strSample_1 = new String (arrSample);
		System.out.println(arrSample);
		char[] arrSample_1 = {'k', 'p', 'l', 's'};
		System.out.println(arrSample_1);
		
}
}