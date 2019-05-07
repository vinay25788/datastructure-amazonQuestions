package com.generic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class RunnbaleTask implements Runnable
{

	@Override
	public void run() {
	System.out.println("hello running Runnabl run method ");
		
	}
	
}
class Task implements Callable<Integer>
{

	

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0;i<10;i++)
			sum+=i;
		return sum;
	}
}
public class CallableRunnableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Task t1 = new Task();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> result =service.submit(t1);
		System.out.println(result.get().toString());
		RunnbaleTask rt = new RunnbaleTask();
		Future<Integer> runnableResult = service.submit(rt, null);
		System.out.println(runnableResult.get().toString());
	}
}
