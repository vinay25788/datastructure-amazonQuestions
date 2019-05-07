package com.practise.basic.producerConsumer;

class Prod implements Runnable
{
	 volatile boolean isProduced;

	 Prod(boolean isProduced)
	 {
		 this.isProduced = isProduced;
	 }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		produced();
	}
	
	public void produced()
	{
		if(isProduced == true)
		{
			System.out.println(" produced ");
		}
		isProduced=false;
	}
}

class Cons implements Runnable
{
	
	 volatile boolean isProduced;
	
	 Cons(boolean is)
	 {
		 this.isProduced = is;
	 }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		consumed();
	}
	
	public void consumed()
	{
		for(int i=0;i<10;i++) {
		if(isProduced == false)
		{
			System.out.println(" consumed ");
		}
		isProduced=true;
		}
	}
}
public class TestProducerWithoutWaitNotify {

	public static void main(String[] args) {
		boolean isTest = true;
		Prod pr = new Prod(isTest);
		isTest = false;
		Cons cr = new Cons(isTest);
		Thread pth = new Thread(pr,"producer");
		Thread cth = new Thread(cr,"consumer");
		pth.start();
		cth.start();
	}
}
