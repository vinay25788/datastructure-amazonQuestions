import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class work implements Runnable
{
	String name;

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" "+Thread.currentThread().getName());
	}
	
	
}


public class ThreadFactoryDemo implements ThreadFactory
{

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		
		Thread th = new Thread(r," custum Thread");
		return th;
	}

	public static void main(String[] args) {
		ThreadFactoryDemo factory = new ThreadFactoryDemo();
		work ob = new work();
		Thread th = factory.newThread(ob);
		th.start();
		ExecutorService ex = Executors.newCachedThreadPool(factory);
		ex.execute(ob);
		ex.shutdown();
	}
}
