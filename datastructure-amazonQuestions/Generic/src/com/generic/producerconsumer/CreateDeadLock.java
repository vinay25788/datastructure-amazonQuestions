package com.generic.producerconsumer;

public class CreateDeadLock implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equalsIgnoreCase("thread1"))
			m1();
		else
			m2();
	}

		public  void m1()
		{
			synchronized(Object.class)
			{
				System.out.println("m1 object");
				synchronized(String.class)
				{
					System.out.println(" m1 string");
				}
			}
		}
		public  void m2()
		{
			synchronized(String.class)
			{
				System.out.println("m2 String");
				synchronized(Object.class)
				{
					System.out.println(" m2 OBject");
				}
			}
		}
	
		public static void main(String[] args) {
			CreateDeadLock obj = new CreateDeadLock();
			Thread thread1= new Thread(obj, "thread1");
			Thread thread2 = new Thread(obj, "thread2");
			thread1.start();
			thread2.start();
		}

}
