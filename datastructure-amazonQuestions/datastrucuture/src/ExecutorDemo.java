import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

class Task implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		test();
	}
	
	public  void test()
	{
		System.out.println(" "+Thread.currentThread().getName());
	}
}
public class ExecutorDemo {

	public static void main(String[] args) {
		Task task = new Task();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
//		/	executor = Executors.sc
		for(int i=0;i<100;i++)
		executor.execute(task);
		executor.shutdown();
		AtomicInteger it;
		
	}
}
