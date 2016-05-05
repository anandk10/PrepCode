package observer;

public class Client {
	public static void main(String[] args) {
		
		Publisher publisher = new Publisher();
		
		Observer obeserver1 = new StringObserver(publisher);

		Observer obeserver2 = new StringObserver(publisher);
		
		Observer obeserver3 = new StringObserver(publisher);
		int i=0;
		while(i<10) {
			publisher.setStringToPublish(i+"..."+Client.class.getSimpleName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
		publisher.unsubscribe(obeserver2);
		
		i=0;
		while(i<10) {
			publisher.setStringToPublish(i+"..."+Client.class.getSimpleName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
		
	}
}
