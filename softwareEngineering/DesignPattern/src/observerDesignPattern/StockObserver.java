package observerDesignPattern;

public class StockObserver implements Observer {

	private double ibmPrice, aaplPrice, googPrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		stockGrabber.register(this);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		System.out.println("Observer ID: "+this.observerID);
		System.out.println("IBM : "+this.ibmPrice + " Apple : " +this.aaplPrice + " Google : " +this.googPrice );
	}

}
