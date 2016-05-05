/**
 * 
 */
package observer;

/**
 * @author iamkarandikar
 *
 */
public interface Observable {
	/**
	 * 
	 * This is the subject, from which the updates would go to the observers
	 * 
	 */
	
	
	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifyObservers();
}
