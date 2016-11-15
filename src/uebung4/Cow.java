package uebung4;

class Cow {

	private static int cowCounter = 0 ;
	private String name;
	private static boolean hungry = true;
	
	Cow (String name) {
		this.name = name;
		this.cowCounter++;
	}

	String getName() {
		return this.name;
	}
	
	public static int getCowCounter(){
		return cowCounter;
	}
	
	public void toggleHungry(){
		hungry = !hungry;
	}

	boolean isHungry() {
		return hungry;
	}
	
	
	
}
