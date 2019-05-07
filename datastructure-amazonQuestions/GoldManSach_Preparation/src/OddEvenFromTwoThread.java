class Printer
{
	public static volatile boolean isEven= true;
	public  synchronized void printEven(int i) throws InterruptedException
	{
		while(isEven == false)
		{
			wait();
		}
		System.out.println(Thread.currentThread().getName()+" "+i);
		isEven = false;
		notifyAll();
	}
	
	public synchronized void printOdd(int i) throws InterruptedException
	{
		while(isEven == true)
		wait();
		System.out.println(Thread.currentThread().getName()+" "+i);
		isEven = true;
		notifyAll();
	}
}

class Task implements  Runnable
{
	
	Printer pr;
	boolean isEven;
	
	Task(Printer pr,boolean isEven)
	{
		this.pr = pr;
		this.isEven = isEven;
	}
	

	@Override
	public void run() {
		
		int num = isEven == true?0:1;
		while(num<10)
		{
			if(isEven)
			{
				try {
					pr.printEven(num);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					pr.printOdd(num);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			num =num+2;
		}
	}
	
}
public class OddEvenFromTwoThread 
{

	public static void main(String[] args) {
		
		Printer pr = new Printer();
		Task even = new Task(pr, true);
		Task odd = new Task(pr,false);
		Thread eth = new Thread(even,"even");
		Thread oth = new Thread(odd,"odd");
		eth.start();
		oth.start();
	}
}
