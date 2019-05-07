
public class OddEvenFromTwoThread implements Runnable
{
	public static volatile int i;
	Object lock;
	
	OddEvenFromTwoThread(Object lock)
	{
		this.lock = lock;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(i<10)
		{
			if(i%2 ==0 && Thread.currentThread().getName().equalsIgnoreCase("even"))
			{
				synchronized(lock) {
				System.out.println(" even "+i);
				i++;
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			if(i%2 ==1 && Thread.currentThread().getName().equalsIgnoreCase("odd"))
			{
				synchronized(lock)
				{
					System.out.println("odd "+i);
					i++;
					lock.notifyAll();
				}
			}
		}
	}
	public static void main(String[] args) {
		Object obj = new Object();
		OddEvenFromTwoThread task = new OddEvenFromTwoThread(obj);
		Thread even = new Thread(task,"even");
		Thread odd = new Thread(task,"odd");
		even.start();
		odd.start();
		
	}

}
