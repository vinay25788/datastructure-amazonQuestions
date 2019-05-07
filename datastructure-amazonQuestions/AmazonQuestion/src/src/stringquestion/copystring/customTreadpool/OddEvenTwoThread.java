package src.stringquestion.copystring.customTreadpool;

class Printe
{
	public static volatile boolean isEven=true;
	static Object obj = new Object();
	
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
		isEven = true;
		this.notifyAll();
	}
}
public class OddEvenTwoThread implements Runnable
{

	Printe pr;
	boolean isEven;
	public OddEvenTwoThread(Printe pr,boolean isEven) {
		this.pr = pr;
		this.isEven = isEven;
	}
	@Override
	public void run() {

		int number = isEven == true?0:1;
		while(number<10)
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
			number=number+2;
		}
		
	}
	
	public static void main(String[] args) {
		Printe pr = new Printe();
		OddEvenTwoThread even = new OddEvenTwoThread(pr, true);
		OddEvenTwoThread odd = new OddEvenTwoThread(pr, false);
		Thread thev = new Thread(even,"even");
		Thread thod = new Thread(odd,"odd");
		thev.start();
		thod.start();
	}
	

}
