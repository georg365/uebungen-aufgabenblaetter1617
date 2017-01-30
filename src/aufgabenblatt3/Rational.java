package aufgabenblatt3;

class Rational {
	
	//Soweit okay, jedoch soll ein Rational Objekt immer für sich stehen und als Objekt existieren, daher auch 
	//die Konstruktoren. Das heißt, dass hier alle Variablen und Methoden Objektvariablen und -methoden sind.
	//Also nicht statisch, da dann nicht mehr zwischen Objekten unterschieden werden kann.
	//Siehe auch Musterlösung in unserem repository: 
	//https://github.com/TUB-VSP-AIfI/uebungen-aufgabenblaetter1617/blob/master/src/musterLoesungen/aufgabenblatt3/Rational.java
	
	
	//Aufpassen! Jeder Bruch, also jedes Rational-Objekt besitzt seinen eigenen Zaehler und Nenner! Daher nicht statisch
	//setzen, sonst sind die beiden Variablen für jedes Rational Objekt gleich.
	// 1. Instanzvariablen
	static int zaehler;
	static int nenner;
	
	//richtig.
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
	
	//hier würdest du dann die eingenen Variablen setzen, wenn sie nicht statisch wären.
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
