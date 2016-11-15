package uebung3;

public class MyWurzel {

	public static String sqrt(int n) {
		int sqr = 0;
		int result = 0;
		for (; sqr * sqr < n; sqr++) {
			result = sqr * sqr;
			
		}
		if (sqr * sqr == n) {
			return "Die Wurzel aus " + n + " ist " + sqr;
		} else {
			return "Keine Wurzel für " + n + " gefunden. Die nächst größere Zahl mit einer "
					+ "Wurzel in den natürlichen Zahlen ist " + sqr * sqr + ". Die Wurzel ist " + sqr;
		}
	}
}
