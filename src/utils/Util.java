package utils;

public class Util {
	public int numberOfWords(String s) {

		return s.split(" ").length;
	}

	public String evenOdd(int a) {
		if (a % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}

	}

}
