package com.generic;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CustemoHandler implements UncaughtExceptionHandler
{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(t.getName()+"exception ");
	}
	
}
public class ThreadPoolDemo implements Runnable
{
	public void run()
	{
		System.out.println(" executed "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(2);
		ThreadPoolDemo d1 = new ThreadPoolDemo();
		ThreadPoolDemo d2 = new ThreadPoolDemo();
		ThreadPoolDemo d3 = new ThreadPoolDemo();
		ThreadPoolDemo d4 = new ThreadPoolDemo();
		ThreadPoolDemo d5 = new ThreadPoolDemo();
		ThreadPoolDemo d6 = new ThreadPoolDemo();
		exe.submit(d1);
		exe.submit(d2);
		exe.submit(d3);
		exe.submit(d4);
		exe.submit(d5);
		exe.submit(d6);
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run()
			{
				System.out.println(" shutdown");
			}
		});
		System.exit(1);
	}

}
