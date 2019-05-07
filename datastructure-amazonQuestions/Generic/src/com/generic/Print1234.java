package com.generic;

public class Print1234 implements Runnable
{
	int remainder;
	public  static  int num=0;
	public Print1234(int rem) {
		this.remainder = rem;
	}
	static Object obj = new Object();

	@Override
	public void run() {
		
		while(num<10) {
		synchronized(obj)
		{
			while(num%4 != this.remainder)
			{
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" "+num);
			num=num+1;
			obj.notifyAll();
		}
	
	}
	}
	public static void main(String[] args) {
		Print1234 obj = new Print1234(1);
		Print1234 obj2 = new Print1234(2);
		Print1234 obj3 = new Print1234(3);
		Print1234 obj4 = new Print1234(0);
		Thread t1 = new Thread(obj,"one");
		Thread t2 = new Thread(obj2,"two");
		Thread t3 = new Thread(obj3,"three");
		Thread t4 = new Thread(obj4,"four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	

}
