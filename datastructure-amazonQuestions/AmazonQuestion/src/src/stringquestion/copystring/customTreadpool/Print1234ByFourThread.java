package src.stringquestion.copystring.customTreadpool;

public class Print1234ByFourThread implements Runnable
{

	static volatile int number =1;
	  int remainder;
	
	static Object obj = new Object();
	
	public Print1234ByFourThread(int rem) {
		this.remainder = rem;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(number<20)
		{
			synchronized(obj)
			{
				while(number%4 != remainder)
				{
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" "+number);
				number++;
				obj.notifyAll();
			}
		}
	}
	
	public static void main(String[] args) {
		Print1234ByFourThread p0= new Print1234ByFourThread(1);
		Print1234ByFourThread p1 = new Print1234ByFourThread(2);
		Print1234ByFourThread p3 = new Print1234ByFourThread(3);
		Print1234ByFourThread p4 = new Print1234ByFourThread(0);
		Thread th1 = new Thread(p0,"one");
		Thread th2 = new Thread(p1,"two");
		Thread th3 = new Thread(p3,"third");
		Thread th4	= new Thread(p4,"four");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
