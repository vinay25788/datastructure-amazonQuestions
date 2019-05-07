package src.stringquestion.copystring.customTreadpool;

class Printer
{
	static volatile boolean isEven = true;
	
	public synchronized void printEven(int i) throws InterruptedException
	{
		while(isEven == false)
		{
			this.wait();
		}
		System.out.println(Thread.currentThread().getName()+" "+i);
		isEven = false;
		this.notifyAll();
	}
	
	public synchronized void printOdd(int i) throws InterruptedException
	{
		while(isEven == true)
		{
			this.wait();
		}
		System.out.println(Thread.currentThread().getName()+" "+i);
		isEven= true;
		this.notifyAll();
	}
}

class Taskk implements Runnable
{

	Printer pr;
	static final int MAX=10;
	boolean isEven;
	Taskk(Printer pr,boolean isEven)
	{
		this.pr = pr;
		this.isEven = isEven;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int number = isEven== true?0:1;
		while(number<MAX)
		{
			if(isEven)
			{
				try {
					pr.printEven(number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					pr.printOdd(number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			number = number+2;
		}
	}
	
}
public class PrintOddEven {
 public static void main(String[] args) {
	Printer pr = new Printer();
	Taskk even = new Taskk(pr, true);
	Taskk odd = new Taskk(pr, false);
	Thread evenT = new Thread(even,"even");
	Thread oddT = new Thread(odd,"odd");
	evenT.start();
	oddT.start();
}
}
