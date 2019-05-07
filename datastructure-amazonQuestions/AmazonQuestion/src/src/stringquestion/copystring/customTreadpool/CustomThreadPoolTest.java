package src.stringquestion.copystring.customTreadpool;

import java.util.LinkedList;
import java.util.List;

interface BlockQueue<E> 
{
	public void put(E e) throws InterruptedException;
	public E take() throws InterruptedException;
	public int size();
}

class CustomBlockingQueue<E> implements BlockQueue<E>
{
	private List<E> list;
	private int size;
	
	CustomBlockingQueue()
	{
		list= new LinkedList<>();
	}
	
    
	@Override
	public  synchronized void put(E e) throws InterruptedException {

		if(list.size() == 5 )
			this.wait();
		list.add(e);
		this.notifyAll();
	}

	@Override
	public synchronized E take() throws InterruptedException {

		if(list.size() == 0)
		{
			this.wait();
		}
		this.notifyAll();
		return list.remove(0);
	}
	


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.list.size();
	}
}

class ThreadPool
{
	private int num;
	private BlockQueue<Runnable> taskQueue;
	private boolean isShutDown= false;
	
	public ThreadPool(int n) {
		// TODO Auto-generated constructor stub
		taskQueue = new CustomBlockingQueue<Runnable>();
		for(int i=0;i<n;i++)
		{
			ThreadPoolThread th= new ThreadPoolThread(taskQueue,this);
			th.setName("thread "+i+" created in threadPool");
			th.start();
		}
	}
	
	public  synchronized void execute(Task task) throws Exception
	{
		if(this.isShutDown)
			throw new Exception("thread pool has been shut down");
		System.out.println(" task added ");
		this.taskQueue.put(task);
		
		
	}
	
	public boolean isShutDownIntiated()
	{
		return this.isShutDown;
	}
	
	public synchronized void shutDown()
	{
		this.isShutDown = true;
		System.out.println(" pool shut down intiated ");
	}
}

class ThreadPoolThread extends Thread
{
	BlockQueue<Runnable> taskQueue;
	ThreadPool pool ;
	ThreadPoolThread(BlockQueue<Runnable> queue,ThreadPool pool)
	{
		this.taskQueue = queue;
		this.pool = pool;
	}
	
	public void run()
	{
		while(true)
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" ready to execute task ");
			try {
				Runnable task = taskQueue.take();
				
				task.run();
				System.out.println(" task executed successfully ");
				if(this.pool.isShutDownIntiated() && this.taskQueue.size()== 0)
				{
					this.interrupt();
					Thread.sleep(10);
				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(" Thread "+Thread.currentThread().getName()+" stopped");
			}
		}
	}
}
class Task implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" executing task ");
	}
	
}
public class CustomThreadPoolTest {
public static void main(String[] args) {
	ThreadPool threadPool=new ThreadPool(2); //create 2 threads in ThreadPool 
    Task task=new Task();
   
    try {
		threadPool.execute(task);
		 threadPool.execute(task);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(" exception occur "+Thread.currentThread().getName());
	}
    
    threadPool.shutDown();
    try {
		threadPool.execute(task);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println(" exception occur "+Thread.currentThread().getName());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
