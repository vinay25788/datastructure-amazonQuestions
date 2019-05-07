
public class JoinDemo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			methodA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized void methodA() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" name -->"+Thread.currentThread().getName());
			//Thread.sleep(100);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinDemo obj = new JoinDemo();
		Thread th1 = new Thread(obj,"thread 1");
		Thread th2 = new Thread(obj," thread 2");
		th1.start();
		th2.start();
		th2.join();
		th1.join();
		System.out.println(" main thread "+Thread.currentThread().getName());
	}
}
