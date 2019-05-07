package com.practise.datastrucutre.dynamicProgramming;

public class PrintEvenOddUsingTwoThreadsUsingTwoMethod implements Runnable
{
	private boolean isEven;
	private Printer print;
	int no;
	PrintEvenOddUsingTwoThreadsUsingTwoMethod(boolean isEven,Printer print){
		this.isEven = isEven;
		this.print = print;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 no = isEven == true?0:1;
		while(no<10)
		{
			if(isEven)
			{
				try {
					print.printEven(no);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
				{
				try {
					print.printOdd(no);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			no = no+2;
		}
		
		
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		PrintEvenOddUsingTwoThreadsUsingTwoMethod evenTask = new PrintEvenOddUsingTwoThreadsUsingTwoMethod(true, printer);
		PrintEvenOddUsingTwoThreadsUsingTwoMethod oddTask = new PrintEvenOddUsingTwoThreadsUsingTwoMethod(false, printer);
		Thread even = new Thread(evenTask,"even");
		Thread odd = new Thread(oddTask,"odd");
		even.start();
		odd.start();
	}
}

class Printer
{
	private static  volatile boolean isEven;
	
	public synchronized void printEven(int num) throws InterruptedException
	{
			while(isEven == false)
			{
				wait();
			}
			System.out.println(Thread.currentThread().getName()+" "+num);
			isEven = false;
			this.notifyAll();
	}
	
	public synchronized void printOdd(int num) throws InterruptedException
	{
			while(isEven == true)
			{
				wait();
			}
			isEven  = true;
			System.out.println(Thread.currentThread().getName() +" "+num);
			this.notifyAll();
	}
}



















