
public class PrintOneTwoThreadUsingOnetwoThreeThread implements Runnable {

	public static volatile int i;
	static Object lock = new Object();
	int numberOfThread;
	int remainder;
	static int number=1;

	public PrintOneTwoThreadUsingOnetwoThreeThread(int remainder) {
		
		this.remainder = remainder;
	}

	@Override
	public void run() {
 
		
		while(number<20)
		{ 
			synchronized(lock) {
			while(number%4 !=remainder )
			{
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 System.out.println(" Thread "+Thread.currentThread().getName()+" "+number);
			 number++;
			 lock.notifyAll();
			}
		}
		
	}
	public static void main(String[] args) {
		Object lock = new Object();
		PrintOneTwoThreadUsingOnetwoThreeThread one = new PrintOneTwoThreadUsingOnetwoThreeThread( 1);
		PrintOneTwoThreadUsingOnetwoThreeThread two = new PrintOneTwoThreadUsingOnetwoThreeThread( 2);
		PrintOneTwoThreadUsingOnetwoThreeThread three = new PrintOneTwoThreadUsingOnetwoThreeThread( 3);
		PrintOneTwoThreadUsingOnetwoThreeThread four = new PrintOneTwoThreadUsingOnetwoThreeThread( 0);
		
		Thread first = new Thread(one,"one");
		Thread second = new Thread(two,"two");
		Thread third = new Thread(three,"three");
		Thread fourth = new Thread(four,"four");
		first.start();
		second.start();
		third.start();
		fourth.start();
		
		
				
		
	}
}
