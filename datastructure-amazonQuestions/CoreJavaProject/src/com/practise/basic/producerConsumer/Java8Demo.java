package com.practise.basic.producerConsumer;

import java.util.function.Predicate;

interface A
{
	
	Ab mes(String s);
}


class TestPred implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>10;
	}
	
}
class Ab
{
	Ab(String s)
	{
		System.out.println("consutructor a"+s);
	}
	public void mes(String s)
	{
		System.out.println("consutructor "+s);
	}
}
public class Java8Demo {

	public static void main(String[] args) {
		A a=Ab::new;
		A b = Ab::new;
		a.mes("vina");
		TestPred t = new TestPred();
		
		Predicate<Integer> pr = (i)->i>20;
		System.out.println("testing Predicate "+pr.test(25));
		System.out.println(t.test(10));
	}
}
