package com.practise.datastrucutre.dynamicProgramming;

public class Singleton {
	
	private static volatile Singleton obj;
	
	public Singleton getInstance()
	{
		if(obj == null)
		{
			synchronized(Singleton.class)
			{
				if(obj == null)
				{
					obj = new Singleton();
				}
			}
		}
		return obj;
		
	}

}
