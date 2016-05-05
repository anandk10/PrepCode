package observerDesignPattern;

public class GrabStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setAaplPrice(100);
		stockGrabber.setGoogPrice(102);
		stockGrabber.setIbmPrice(200);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setAaplPrice(300);
		stockGrabber.setGoogPrice(222);
		stockGrabber.setIbmPrice(400);
		
		stockGrabber.unregister(observer2);
		StockObserver observer3 = new StockObserver(stockGrabber);
		
		stockGrabber.setAaplPrice(300);
		stockGrabber.setGoogPrice(602);
		stockGrabber.setIbmPrice(70);
		
		
		
		
	}

}
