import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Barrier1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" barrier 1 executions done ");
	}
	
}
class Barrier2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" barrier 2 executions done ");
	}
	
}
public class CyclicBarrierDemo implements Runnable
{
	CyclicBarrier barrier1;
	CyclicBarrier barrier2;
	
	public CyclicBarrierDemo(CyclicBarrier b1,CyclicBarrier b2) {
		// TODO Auto-generated constructor stub
		this.barrier1 = b1;
		this.barrier2 = b2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(" thread "+Thread.currentThread().getName());
			barrier1.await();
			System.out.println(" thread "+Thread.currentThread().getName());
			barrier2.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		CyclicBarrier b1 = new CyclicBarrier(2,new Barrier1());
		CyclicBarrier b2 = new CyclicBarrier(2, new Barrier2());
		
		CyclicBarrierDemo obj = new CyclicBarrierDemo(b1, b2);
		Thread th1 = new Thread(obj,"thread1");
		Thread th2 = new Thread(obj,"thread2");
		th1.start();
		th2.start();
	}
}


