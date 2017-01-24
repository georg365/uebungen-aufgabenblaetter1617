package aufgabenblatt3;

class Rational {
	
	
	
	// 1. Instanzvariablen
	static int zaehler;
	static int nenner;
	
	// 2. Konstruktor ohne Argumente
	Rational(){
		zaehler = 0;
		nenner = 1;
	}
	
	// 3. Ausgabemethode
	public static void printRational(){
			
		System.out.println("Der Zähler ist: " + zaehler);
		System.out.println("Der Nenner ist: " + nenner);
	}
	
	// 4. Getter und Setter
	public static int getZaehler() {
		return zaehler;
	}

	public static void setZaehler(int zaehler) {
		Rational.zaehler = zaehler;
	}

	public static int getNenner() {
		return nenner;
	}

	public static void setNenner(int nenner) {
		Rational.nenner = nenner;
	}

	// 5. main-Methode
	public static void main(String[] args){
		new Rational();
		Rational.setZaehler(5);
		Rational.setNenner(10);
		printRational();
		negate();
		printRational();
		invert();
		printRational();
		;
		System.out.println(toDouble());
	}
	
	// 6. Konstruktor mit Argumenten
	Rational(int a, int b){		
	}
	
	// 7. negate-Methode
	public static void negate(){
		Rational.setZaehler(Rational.getZaehler()*(-1));
	}
	
	// 8. invert-Methode
	public static void invert(){
		int saveElement = Rational.getNenner();
		Rational.setNenner(getZaehler());
		Rational.setZaehler(saveElement);
	}
	
	// 9. toDouble-Methode
	public static double toDouble(){
		double rationalNumber =  zaehler /  nenner;		
		return (rationalNumber);		
	}
	
	// 10. reduce-Methode
//	public static double reduce(){
//		int a = Rational.getZaehler();
//		int b = Rational.getNenner();
//		
//		Math.
//		
//		return 0;		
//	}
	
	
	
	
	
	
	
	
	
	
	
}
