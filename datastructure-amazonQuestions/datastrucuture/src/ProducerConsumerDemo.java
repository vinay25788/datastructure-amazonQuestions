import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Producer implements Runnable
{
	Queue<Integer> queue;
	int size;
	int i;
	Producer (Queue<Integer> q,int size)
	{
		this.queue = q;
		this.size = size;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		produced();
	}
	
	public synchronized void produced()
	{
		while(true) {
		while(queue.size() ==size)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" produced "+i);
		queue.add(i++);
		notifyAll();
	}
	}
}

 class Consumer implements Runnable
{
	Queue<Integer> queue;
	
	
	Consumer(Queue<Integer> q)
	{
		this.queue =q;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		consumed();
	}
	
	public synchronized void consumed()
	{
		while(true ) {
		while(queue.size() == 0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" consumed "+queue.remove());
		notifyAll();
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		int size = 5;
		Producer p = new Producer(q, size);
		Consumer c = new Consumer(q);
		Thread pth = new Thread(p," producer ");
		Thread cth = new Thread(c,"consumer");
		pth.start();
		cth.start();
				
	}
}



















