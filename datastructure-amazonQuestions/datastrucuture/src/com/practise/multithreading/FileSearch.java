package com.practise.multithreading;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileSearch implements Runnable
{
	String initPath;
	String fileName;
	
	public FileSearch(String initPath,String fileName) {
		this.initPath = initPath;
		this.fileName = fileName;
	}
	
	

	@Override
	public void run() {

		File file = new File(initPath);
		if(file.isDirectory())
		{
			try {
				directoryProcess(file);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void directoryProcess(File file) throws InterruptedException
	{
		File[] files = file.listFiles();
		if(files != null)
		{
			for(int i=0;i<files.length;i++)
			{
				if(files[i].isDirectory())
					{
					System.out.println(" 1");
					directoryProcess(files[i]);
					}
				else
					processFile(files[i]);
			}
		}
	}
	
	public void processFile(File file) throws InterruptedException
	{
		if(file.getName().equals(fileName))
		{
			System.out.printf(" %s %s\n",Thread.currentThread().getName(),file.getAbsolutePath());
		}
		if(Thread.interrupted())
			throw new InterruptedException();
	}
	
	public static void main(String[] args) {
		FileSearch searcher = new FileSearch("C:\\LLoyds_Project\\books", "Java Concurrency in Practice.pdf");
		Thread thread = new Thread((searcher));
		thread.start();
		try
		{
			TimeUnit.SECONDS.sleep(10000);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		thread.interrupt();
	}
}











