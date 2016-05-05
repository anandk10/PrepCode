package strategyDesignPattern;

public class Client {


	
	public static void main(String args[]) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println(sparky.tryToFly());
		System.out.println(tweety.tryToFly());
		sparky.setFlyingAbility(new ItFlys());
		System.out.println(sparky.tryToFly());
		
	}
	
}
