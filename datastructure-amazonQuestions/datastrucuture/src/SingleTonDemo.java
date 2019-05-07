
public class SingleTonDemo {

	private static    volatile SingleTonDemo obj;
	
	private SingleTonDemo()
	{
		
	}
	
	SingleTonDemo getInstance()
	{
		if (obj == null)
		{
			synchronized(SingleTonDemo.class)
			{
				if(obj == null)
				{
					obj = new SingleTonDemo();
				}
			}
		}
		
		return obj;
	}
}
