package src.stringquestion.copystring.customTreadpool;

interface In
{
	default void m1()
	{
		System.out.println("interfacce");
	}
}
class Aa 
{
	/*public void m1()
	{
		System.out.println("A");
	}*/
}



public class Decoding extends Aa implements In
{
	public static void main(String[] args) {
		Decoding d = new Decoding();
		//In a = new Decoding();
		d.m1();
	}
}
