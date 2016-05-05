package singletonDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton instance1 = Singleton.getInstance();
		
		System.out.println(instance1.getInstance().hashCode());
	
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance2.getInstance().hashCode());
	
		
	}

}
