import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface Area<T>
{
	T getArea(T a);
}
interface Demo
{
	public void sum(int a, int b);
}
class TestSer implements Serializable
{
	static int a;
	transient int b;
	TestSer(int a,int b)
	{
		this.a =a;
		this.b  = b;
	}
}
public class StaticSerialLizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Integer i3=Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		System.out.println(i3==i2);
		
		Runnable r = ()->
		{
			int i=8;
			while(i>0)
			System.out.println(i--);
		};
		
		//r.run();
		Demo d = (a,b)->System.out.println(a+b);
		d.sum(4, 7);
		String s;
		
		Area<Double> ar = (a)->a*a;
		System.out.println(ar.getArea(4.5));
		
		Comparator<String> sort = (a,b)->{
			return a.compareTo(b);
		};
		
		List<String> ls = new ArrayList<>();
		ls.add("vina");
		ls.add("ab");
		Collections.sort(ls, sort);
		System.out.println(ls);
		
		File file = new File("a.ser");
		TestSer obj = new TestSer(4,10);
		obj.a=10;
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream foo = new ObjectOutputStream(fout);
		foo.writeObject(obj);
		
		FileInputStream fin = new FileInputStream("a.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		TestSer ob = (TestSer) oin.readObject();
		System.out.println(ob.a+" b "+ob.b);
	}
	

}
