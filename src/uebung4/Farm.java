package uebung4;

class Farm {

	public static void main(String[] args) {
				
		Cow cow1 = new Cow("Berta");
		Cow cow2 = new Cow("Hilde");
		Cow cow3 = new Cow("Miltank");
			
		System.out.println( cow1.getName() ); 
		System.out.println( cow2.getName() );
		System.out.println( cow3.getName() );
		
		System.out.println("Anzahl der Kühe: " + Cow.getCowCounter());
		
		Farmer farmer = new Farmer ();
		System.out.println("Kuh ist hungrig " + cow1.isHungry());
		farmer.feedCow(cow1);
		System.out.println("Kuh ist hungrig " + cow1.isHungry());
	}

}
