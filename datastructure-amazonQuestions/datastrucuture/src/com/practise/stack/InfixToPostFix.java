package com.practise.stack;

import java.util.Stack;

public class InfixToPostFix {
	
	Stack<Character> st = new Stack<>();
	
	public int prec(Character c)
	{
		switch(c) 
		{
		case '+': 
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	public void convert(String exp)
	{
		StringBuffer sb= new StringBuffer("");
		
		for(int i=0;i<exp.length();i++)
		{
			char ch= exp.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
			{
				sb.append(ch);
			}
			/*if(ch >='a' && ch<='z' || ch >='A' && ch<='Z')
			{
				sb.append(ch);
			}*/
			else if(ch == '(')
			{
				st.push(ch);
			}
			else if (ch== ')')
			{
				while(!st.isEmpty() && st.peek()!='(')
					{
					sb.append(st.pop());
					}
				if(!st.isEmpty() && st.peek() != '(')
					System.out.println(" invalid expression ");
				else
					st.pop();
			}
			else
			{
				
					while(!st.isEmpty() && prec(ch)<=prec(st.peek()))
					{
						sb.append(st.pop());
					}
					st.push(ch);
			}
		}
		while (!st.isEmpty()) 
            sb.append(st.pop()); 
		System.out.println(sb);
	}
	public static void main(String[] args) {
		 String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
	       InfixToPostFix obj = new InfixToPostFix();
	       obj.convert(exp);
	}

}
///abcd^e-fgh*+^*+i-