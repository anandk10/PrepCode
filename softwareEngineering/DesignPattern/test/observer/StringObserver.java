package observer;

public class StringObserver implements Observer {

	String myString;
	
	/* Have a publisher object */
	Observable publisher;
	static int ObserverId = 0;
	int observerId;
	public StringObserver(Observable publisher) {
		// TODO Auto-generated constructor stub
		this.publisher = publisher;
		this.publisher.subscribe(this);
		this.observerId = ++ObserverId;
		System.out.println("Observer "+observerId+" created.");
	}
	
	@Override
	public void update(String newString) {
		// TODO Auto-generated method stub
		this.myString = newString;
		System.out.println("New published string ("+this.observerId+") : "+this.myString);
	}

}
