package com.practise.datastrucutre.dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

class Person
{
	
}
class Employee
{
	
}
public class PrintOddEvenUsingRemainder implements Runnable
{
	
	public  int remainder;
	static Object obj;
	static int no;
	
	PrintOddEvenUsingRemainder(int remainder,Object obj)
	{
		this.remainder = remainder;
		this.obj = obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(no<10)
		{
			synchronized(obj)
			{
				while(no%2 != remainder )
				{
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(" "+Thread.currentThread().getName()+" "+no);
				no++;
				obj.notifyAll();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		PrintOddEvenUsingRemainder p1 = new PrintOddEvenUsingRemainder(1, obj);
		PrintOddEvenUsingRemainder p2 = new PrintOddEvenUsingRemainder(0, obj);
		Thread t1 = new Thread(p1,"odd");
		Thread t2 = new Thread(p2,"even");
		t1.start();
		t2.start();
		Set set = new HashSet<>();
		
	} 

}













