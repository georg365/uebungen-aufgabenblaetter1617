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
			return "Keine Wurzel f�r " + n + " gefunden. Die n�chst gr��ere Zahl mit einer "
					+ "Wurzel in den nat�rlichen Zahlen ist " + sqr * sqr + ". Die Wurzel ist " + sqr;
		}
	}
}
