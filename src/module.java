import java.util.concurrent.SynchronousQueue;

public class module {

	public static void main(String[] args) {
		char[] oneFrom = { 'k', 'p', 'l', 'o', 'd', 'h', 'i' };

		char[] copyTo = { 'c', 'h', 'h', 'a', 'g', 'a', 'n' };

		char[] c = new char[14];
		System.arraycopy(oneFrom, 0, c, 0, 4);
		System.arraycopy(copyTo, 0, c, 4, 4);
		System.arraycopy(oneFrom, 4, c, 8, 3);
		System.arraycopy(copyTo, 4, c, 11, 3);
		System.out.println(c);
	}
}
