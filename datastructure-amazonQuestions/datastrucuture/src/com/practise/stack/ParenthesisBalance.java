package com.practise.stack;

import java.util.Stack;

public class ParenthesisBalance {

	Stack st = new Stack<>();
	
	public boolean isMaching(char a,char b)
	{
		if(a== '[' && b == ']')
			return true;
		else if (a== '{' && b == '}') 
			return true;
		else if (a== '(' && b == ')')
			return true;
		return false;
	}
	
	public void checkBalance(char[] exp)
	{
		char ch;
		for(int i=0;i<exp.length;i++)
		{
			ch = exp[i];
			if(ch == '(' || ch == '{' || ch=='[')
				st.push(ch);
			else if (ch == ')' || ch == '}' || ch==']')
			{
				if(st.isEmpty() )
					System.out.println(" unbalanced ");
				if(!isMaching((char)st.pop(), ch))
					System.out.println(" unbalanced");
			}
		}
		
		if(st.isEmpty() == false)
			System.out.println(" unbalanced ");
		else
			System.out.println(" coreect ");
	}
	
	public static void main(String[] args) {
		 char exp[] = {'{','(',')','}','[',']'}; 
         ParenthesisBalance obj = new ParenthesisBalance();
         obj.checkBalance(exp);
	}
}
