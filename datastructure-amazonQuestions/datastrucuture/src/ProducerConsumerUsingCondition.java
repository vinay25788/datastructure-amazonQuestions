import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProducerConsumerImple
{
	Lock lock = new ReentrantLock();
	Condition bufferNotFull = lock.newCondition();
	Condition bufferNotEmpty = lock.newCondition();
	Queue<Integer > q = new LinkedList<>();
	int size = 5;
	int i;
	
	
	public void put()
	{
		lock.lock();
		try {
		
			for(int i=0;i<10;i++) {
		
				while(q.size() == size)
				{
					try {
						bufferNotEmpty.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(" produced "+i);
				//i++;
				bufferNotFull.signalAll();
			}
		}finally
		{
			lock.unlock();
		}
			
	}
	
	public void get()
	{
		lock.lock();
		try
		{
			while(true)
			{
				while(q.size() == 0)
				{
					try {
						bufferNotFull.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(" consumed "+q.poll());
				bufferNotEmpty.signalAll();
			}
		}finally
		{
			lock.unlock();
		}
	}
	
}

class Producer2 implements Runnable
{
	ProducerConsumerImple obj;
	
	Producer2(ProducerConsumerImple ob)
	{
		this.obj = ob;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.put();
	}
	
}

class Consumer2 implements Runnable
{
	ProducerConsumerImple obj;
	
	Consumer2(ProducerConsumerImple ob)
	{
		this.obj = ob;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.get();
	}
	
}
public class ProducerConsumerUsingCondition {

	public static void main(String[] args) {
		ProducerConsumerImple obj = new ProducerConsumerImple();
		Producer2  pr = new Producer2(obj);
		Consumer2 cr = new Consumer2(obj);
		Thread pth = new Thread(pr,"producer");
		Thread cth = new Thread(cr,"consumer");
		
		pth.start();
		cth.start();
	}
	
}























