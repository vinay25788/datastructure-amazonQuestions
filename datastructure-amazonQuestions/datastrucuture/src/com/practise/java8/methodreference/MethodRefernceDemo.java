package com.practise.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface EmployeeGenerator
{
	Employee createEmployee();
	
	default void setP()
	 {
		 System.out.println("hello set");
	 }
	
	default void cad()
	{
		
	}
	
	static void calc()
	{
		
	}

	static void cald()
	{
		
	}
}

class Employee
{
	String name;
	Employee()
	{
		System.out.println(" constructor without argument ");
	}
	Employee(String name)
	{
		this.name = name;
		System.out.println(" constructor with argument ");
	}
	
	public String getName()
	{
		return this.name;
	}
}
interface Sum
{
	int getSum(int a,int b);
	 default void getDone()
	{
		System.out.println("hello default");
	}
	 
	 default void setP()
	 {
		 System.out.println("hello set");
	 }
}

class Reference implements Sum ,EmployeeGenerator
{
	// method used for static reference
	 int testA=19;
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	public  int findSum(int a,int b)
	{
		
		
		return a+b;
	}
	

	/* public void setP()
	 {
		 System.out.println("hello set in Reference");
	 }
*/
	@Override
	public int getSum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setP() {
		// TODO Auto-generated method stub
		EmployeeGenerator.super.setP();
	}
}
public class MethodRefernceDemo {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("vinay");
		list.add("kumar");
		list.add("abc");
		list.add("adc");
		list.stream().map(String::toUpperCase).sorted((a,b)->a.compareTo(b)).forEach(System.out:: println);
		
		IntStream intStream = IntStream.of(1,2,3,4,5,6,7);
		intStream.filter(i->i%2==0).forEach(System.out::println);
		
		IntStream intStream3 = IntStream.of(1,2,3,4,5,6,7);
		int result = (int) intStream3.filter(n-> n>3).count();
		System.out.println(" result "+result);
		
		Integer[] a = {1,2,3,4};
		Stream<Integer> st = Stream.of(a);
		//IntStream.range(2, 6).fil
		IntStream intStream4 = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		OptionalDouble av = intStream4.filter(i->i<5).average();
		System.out.println(" average "+av.getAsDouble());
		
		IntStream intStream5 = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		int sumofin = intStream5.filter(i->i<5).sum();
		System.out.println(" sum of first f5 int "+sumofin);
		
		IntStream intStream2 = IntStream.of(1,2,3,4,5,6,7);
		OptionalInt max = intStream2.max();
		System.out.println("maximum "+max.getAsInt());
		
		Reference re = new Reference();
		int c=10;
		
		//static reference
		Sum s = Reference::sum;
		System.out.println(s.getSum(2, 4));
		
		
		// instance mehtod reference 
		Reference ref = new Reference();
		Sum findSum = ref::findSum;
		System.out.println(findSum.getSum(2, 5));
		
		// constructor reference
		EmployeeGenerator e1 = Employee::new ;
		Employee e2 = e1.createEmployee();
		System.out.println(e2.getName());
		
		ref.getDone();
		ref.setP();
		
		Predicate<Integer> pr = (i)->i>10?true:false;
		System.out.println(pr.test(5));
	}
}
