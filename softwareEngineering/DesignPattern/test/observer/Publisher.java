package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the Observable interface.
 * This class is responsible for publishing the changes to its observers
 * @author iamkarandikar
 *
 */
public class Publisher implements Observable {

	/**
	 * Have a set of Observers
	 */
	
	String stringToPublish;
	List<Observer> observers;

	public Publisher() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
		stringToPublish = this.getClass().getSimpleName();
	}
	
	
	
	public void setStringToPublish(String stringToPublish) {
		this.stringToPublish = stringToPublish;
		notifyObservers();
	}



	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(stringToPublish);
		}
	}
	
	
	
	
}
