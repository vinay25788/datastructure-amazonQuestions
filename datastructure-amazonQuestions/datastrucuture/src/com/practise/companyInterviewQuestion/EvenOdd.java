package com.practise.companyInterviewQuestion;

class Printt
{
	Object obj;
	 static volatile boolean isEven = true;
	Printt(Object obj)
	{
		this.obj = obj;
	}
	
	public void printEven(int num) throws InterruptedException
	{
		synchronized(obj)
		{
			while(isEven == false)
			{
				obj.wait();
			}
			System.out.println(Thread.currentThread().getName() +" "+num);
			isEven = false;
			obj.notifyAll();
		}
		
	}
	
	public void printOdd(int num) throws InterruptedException
	{
		synchronized(obj)
		{
			while(isEven == true)
			{
				obj.wait();
			}
			System.out.println(Thread.currentThread().getName() +" "+num);
			isEven = true;
			obj.notifyAll();
		}
		
	}
}
public class EvenOdd implements Runnable
{

	Printt prnt;
	boolean isEven;
	EvenOdd(Printt pr,boolean isEven)
	{
		this.prnt = pr;
		this.isEven = isEven;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num = isEven == true?0:1;
		while(num<10)
		{
			if(num %2 == 0)
			{
				try {
					prnt.printEven(num);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					prnt.printOdd(num);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			num = num+2;
		}
		
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		Printt pr = new Printt(obj);
		EvenOdd eo = new EvenOdd(pr, true);
		EvenOdd eo2 = new EvenOdd(pr, false);
		Thread evn = new Thread(eo,"even");
		Thread odd = new Thread(eo2,"odd");
		evn.start();
		odd.start();
	}
	
}
























