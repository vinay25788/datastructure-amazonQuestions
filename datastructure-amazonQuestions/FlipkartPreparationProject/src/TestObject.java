
public class TestObject {

	public void m1(Object in)
	{
		System.out.println(" in");
	}
	
	public void m1(String out)
	{
		System.out.println(" out");
	}
	public static void main(String[] args) {
		TestObject obj = new TestObject();
		obj.m1(null);
		Integer i1 = Integer.valueOf(128);
		Integer i2 =Integer.valueOf(128);
		System.out.println(i1==i2);
	}
}
