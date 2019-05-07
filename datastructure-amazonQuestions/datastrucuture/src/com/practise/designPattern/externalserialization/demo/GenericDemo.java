package com.practise.designPattern.externalserialization.demo;

import java.util.ArrayList;
import java.util.List;

 

	 class Currency {
	   private int currency; //CurrencyDenom.PENNY,CurrencyDenom.NICKLE,
	                         // CurrencyDenom.DIME,CurrencyDenom.QUARTER
	}
class Demo<T>
{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
class DD
{
	
}
class AA extends DD
{
	int n;

	@Override
	public String toString() {
		return "AA [n=" + n + "]";
	}
	
}

class BB extends AA
{
	String name;

	@Override
	public String toString() {
		return "BB [name=" + name + "]";
	}
	
}

class C extends BB
{
	String name;

	@Override
	public String toString() {
		return "C [name=" + name + "]";
	}
	
}
class CurrencyDenom {
	   public static final int PENNY = 1;
	   public static final int NICKLE = 5;
	   public static final int DIME = 10;
	   public static final int QUARTER = 25;
	}



public class GenericDemo {
	//public enum Currency {PENNY, NICKLE, DIME, QUARTER};
	public enum Currency {
	    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	    private int value;

	    private Currency(int value) {
	            this.value = value;
	    }
	
	public static void main(String[] args) {
		System.out.println(CurrencyDenom.DIME);
		
	System.out.println(Currency.valueOf("1"));	
		
		Demo d = new Demo();
		d.t = "vinay"	;
		System.out.println(d.t);
		d.t =5;
		System.out.println(d.t);
		Demo<String> ds = new Demo();
		ds.t ="vinay";
		System.out.println(ds.t);
		//ds.t =5;
		
		List<AA> listA = new ArrayList<>();
		AA a = new AA();
		List<BB> listB = new ArrayList<>();
		BB b = new BB();
		listA.add(a);
		listB.add(b);
		List<C> listC = new ArrayList<>();
		listC.add(new C());
		GenericDemo obj = new GenericDemo();
		/*obj.add(listA);
		obj.add(listB);
		obj.add(listC);*/
	//	List<Integer>[] array = new List<Integer>[10];
		
		
	}
	
	public  void add(List<? extends AA> list)
	{
		
		System.out.println(list.toString());
		//list.add(new BB());
	}
	public  void addSuper(List<? super AA> list)
	{
		
		System.out.println(list.toString());
		list.add(new C());
	}
}
}
