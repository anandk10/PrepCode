/**
 * 
 */
package observer;

/**
 * @author iamkarandikar
 *
 */
public interface Observer {
	/**
	 * 
	 * This is the one who observes the Observable
	 * 
	 */
	
	/**
	 * The Subject, or the Observable would update the String variable
	 * by invoking the update() method of the Observer
	 * @param newString
	 */
	public void update(String newString);
	
}
