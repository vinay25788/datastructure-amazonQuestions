package com.generic;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class TestThread implements  Runnable
{
	public void m1()
	{
		throw new Error();
	}
	
	public void m2() throws Throwable
	{
		throw new Throwable();
	}
	public static void main(String[] args) {
		TestThread th = new TestThread();
		Thread the = new Thread(th);
		the.start();
		System.out.println(" end main");
		Set<Integer> linked = new LinkedHashSet<>();
		linked.add(1);
		//Executor ex = Executors.
		CyclicBarrier bar = new CyclicBarrier(2);
		try {
		th.m1();
		}catch(Error er)
		{
			System.out.println("error");
		}
		System.out.println("ehllo");
		try {
			th.m2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(" ehllo throwable");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" thread "+Thread.currentThread().getName());
	}
}
