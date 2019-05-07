
public class DeadLockDemo implements Runnable
{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equalsIgnoreCase("thread1"))
			m1();
		else
			m2();
	}
	
	public void m1()
	{
		synchronized(String.class)
		{
			try {
				System.out.println(" inside m1 "+Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Object.class)
			{
				System.out.println(" inside object ");
			}
		}
	}
	
	public void m2()
	{
		synchronized(Object.class)
		{
			System.out.println(" inside m2 "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(String.class)
			{
				System.out.println(" inside string ");
			}
		}
	}
	public static void main(String[] args) {
		DeadLockDemo obj = new DeadLockDemo();
		Thread t1 = new Thread(obj, "thread1");
		Thread t2 = new Thread(obj,"thread2");
		t1.start();
		t2.start();
	}
	
}
