package observerDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	
	ArrayList<Observer> observers;
	private double ibmPrice, aaplPrice, googPrice;
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer delteObserver) {
		// TODO Auto-generated method stub
		int observerIndex  = observers.indexOf(delteObserver);
		System.out.println("Observer " + observerIndex +" deleted.");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}
	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}
	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}

}
