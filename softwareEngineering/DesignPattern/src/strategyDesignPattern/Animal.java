package strategyDesignPattern;

public class Animal {

	public Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	
}
