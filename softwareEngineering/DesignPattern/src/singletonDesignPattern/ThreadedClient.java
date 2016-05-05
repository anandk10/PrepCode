package singletonDesignPattern;

public class ThreadedClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable thread1 = new GetInstanceThread();
		Runnable thread2 = new GetInstanceThread();
		
		new Thread(thread1).start();

		new Thread(thread2).start();
		new Thread(new GetInstanceThread()).start();

		
		
		
	}

}
