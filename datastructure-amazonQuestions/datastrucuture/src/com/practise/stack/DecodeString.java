package com.practise.stack;

import java.util.Stack;

public class DecodeString {
	
	
	public void decodeString(String str)
	{
		Stack<Integer> ints	= new Stack<>();
		Stack<Character> chars = new Stack<>();
		int val=0;
		String result="", temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int count=0;
			if(Character.isDigit(ch))
			{
				while( Character.isDigit(str.charAt(i)))
				{
					count = count *10+str.charAt(i)-'0';
					i++;
				}
				i--;
				ints.push(count);
			}
			else if(ch == ']')
			{
				temp="";
				count=0;
				
				if(ints.isEmpty() == false)
				{
					count = ints.pop();
				}
				
				while(chars.isEmpty() == false && chars.peek() != '[')
				{
					temp=chars.peek()+temp;
					chars.pop();
				}
				
				if(chars.isEmpty() == false && chars.peek() == '[')
					chars.pop();
				for(int t=0;t<count;t++)
				{
					result= result+temp;
					
				}
				
				for(int t=0;t<result.length();t++)
				{
					chars.push(result.charAt(t));
				}
				result="";
			}
			
			else if (ch == '[')
			{
				chars.push(ch);
			}
			else
			{
				chars.push(ch);
			}
		}
		
		while (!chars.isEmpty()) 
        { 
            result = chars.peek() + result; 
            chars.pop(); 
        } 
       System.out.println(result);
	}
	public static void main(String[] args) {
		String str = "3[b2[ca]]"; 
		DecodeString obj = new DecodeString();
        obj.decodeString(str); 
    } 
	}


