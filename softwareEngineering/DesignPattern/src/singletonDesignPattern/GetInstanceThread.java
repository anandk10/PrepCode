package singletonDesignPattern;

public class GetInstanceThread implements Runnable{

	Singleton threadInstance = null;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
		threadInstance = Singleton.getInstance();
		System.out.println("Thread instance : "+threadInstance.getInstance().hashCode());
		
	}

}
