package com.practise.basic.typeeraser;

import java.util.Stack;

class IntegerStack extends Stack<Integer>
{
	 public void push(Object value) {
	        push((Integer)value);
	    }
	public  Integer push(Integer a)
	{
		return super.push(a);
	}
}
public class TestErasor {
	public static void main(String[] args) {
		IntegerStack inst = new IntegerStack();
		Stack st = inst;
		st.push("vinay");
		Integer val = inst.pop();
	}

}
