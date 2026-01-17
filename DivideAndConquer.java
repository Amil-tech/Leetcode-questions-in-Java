import java.util.Arrays;

public class DivideAndConquer {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		//System.out.println(sum(ar, 0));
		//System.out.println(reverse("fwrefwgerger", ""));
		printNumbersFrom(22);
	}
	
	
	public static int Eucled(int uzun, int en) {
		if (en == 0) return uzun;
		else return Eucled(en, uzun % en);
	}
	
	public static int sum(int[] array, int cem) {
		if (array.length == 0) return cem;
		cem += array[0];
		return sum(Arrays.copyOfRange(array, 1, array.length), cem);
	}
	
	public static String reverse(String word, String r) {
		if (word.length() == 0) return r;
		return reverse(word.substring(0, word.length() - 1), r + word.charAt(word.length()-1));
	}
	
	public static void printNumbersFrom(int n) {
		if (n <= 0) return;
		System.out.println(n);
		printNumbersFrom(n - 1);
	}
	
	

}
