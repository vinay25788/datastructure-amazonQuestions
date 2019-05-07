package com.practise.basic.producerConsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" taks executed ");
	}
	
}

public class TestExecutor {
	public static void main(String[] args) {
		Executor ex =  Executors.newSingleThreadExecutor();
		ex.execute(new Task());
		//ex.invokeAll(tasks)
	}

}
