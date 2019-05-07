import java.util.concurrent.CountDownLatch;

public class CountdownlatchDemo implements Runnable {

	CountDownLatch latch;
	
	public CountdownlatchDemo(CountDownLatch latch) {
		// TODO Auto-generated constructor stub
		this.latch = latch;
	}

	public void arrive()
	{
		System.out.println(" Thread name "+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		arrive();
		latch.countDown();
	}
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		CountdownlatchDemo obj = new CountdownlatchDemo(latch);
		Thread th1 = new Thread(obj,"thread1");
		Thread th2 = new Thread(obj,"thead2");
		Thread th3 = new Thread(obj,"thread3");
		th1.start();
		th2.start();
		th3.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" main finised ");
	}
}
