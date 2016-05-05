package singletonDesignPattern;

public class Singleton {

	volatile private static Singleton instance = null;
	static boolean firstThread = true;
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() {
		
		if(instance==null) {
			
			synchronized (Singleton.class) {
				
				if(instance == null) {
					instance =  new Singleton();
				}
				
				
			}
			
		}
		
		return instance;
		
	}
	
	
}
