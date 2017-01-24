package aufgabenblatt2;

public class Euler {

	public static double myExp(int x, int n) {
		// TODO berechne e^x mittels der auf Aufgabenblatt 2 angegebenen Formel
		
		double expSlow = 0.;
				
		for (int i=0; i<=n ;i++){			
			expSlow = expSlow + ((Math.pow(x, i))/(calcFaculty(i)));
		}
		return expSlow;
	}
	
	private static long calcFaculty(int basis) {
		// TODO Auto-generated method stub
				
		long faculty=1;
		for (int j=1 ; j<=basis ; j++){
			faculty = faculty*j;
		}
		return faculty;
		
	}

	public static double myExpFast(int x, int n){
		int zaehler = 1;
		int nenner = 1;
		double expFast = 1.;
		
		for (int i=1; i<=n; i++){
			zaehler = zaehler * x;
			nenner = nenner * i;
			expFast = expFast + (double) zaehler/ (double) nenner;
		}
				
		
		
		return expFast;
		// TODO beschleunige myExp()
	}
	
	public static void main(String[] args) {
		System.out.println(myExp(5, 100));
		System.out.println(myExpFast(5, 100));
		System.out.println(Math.exp(5));

	}

}
