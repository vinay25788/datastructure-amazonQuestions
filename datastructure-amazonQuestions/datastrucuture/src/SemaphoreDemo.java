import java.util.concurrent.Semaphore;

class ProducerConusmeImpl implements Runnable
{
	Semaphore s1 ;
	Semaphore s2;
	ProducerConusmeImpl(Semaphore s1,Semaphore s2)
	{
		this.s1 =s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			if(Thread.currentThread().getName().equals("producer"))
			{
				produce();
			}
			else
				consume();
		
	}
	
	public void produce()
	{
		for(int j=0;j<5;j++) {
		try {
			s1.acquire();
			System.out.println("produced "+j++);
			s2.release();
		}
		catch(InterruptedException e)
		{
			System.out.print(e.getMessage());
		}
		}
	}
	
	public void consume() {
		
		for(int j=0;j<5;j++) {
		try
		{
			s2.acquire();
			System.out.println(" consumed "+j++);
			s1.release();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
}
public class SemaphoreDemo implements Runnable{

	Semaphore s1;
	public SemaphoreDemo(Semaphore s1) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
	}
	
	public void m1() throws InterruptedException
	{
		s1.acquire();
		System.out.println(" thread name "+Thread.currentThread().getName());
		s1.release();
	}
	
	public static void main(String[] args) {
		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(0);
		ProducerConusmeImpl obj  = new ProducerConusmeImpl(s1, s2);
		
		SemaphoreDemo sd = new SemaphoreDemo(s1);
		Thread th = new Thread(obj,"producer");
		Thread th2 = new Thread(obj," consumer");
		
		th.start();
		th2.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
