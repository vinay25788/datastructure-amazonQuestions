package com.practise.stringprogram.basic;

import java.util.regex.Pattern;

public class RemovePuncutation 
{ 
    public static void main(String[] args) 
    { 
        // input string 
        String str = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks"; 
          
        // similar to Matcher.replaceAll 
        str = str.replaceAll("\\p{Punct}",""); 
          
        System.out.println(str); 
        
        Integer i = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i==i2);
        
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        System.out.println(i3== i4);
        String s1 = "Welcome to geeksforgeeks"; 
        System.out.println(reverseWords(s1)); 
  
        String s2 = "I love Java Programming"; 
        System.out.println(reverseWords(s2)); 
        
        
    } 
      
    static String reverseWords(String str) 
    { 
  
        // Specifying the pattern to be searched 
        Pattern pattern = Pattern.compile("\\s"); 
  
        // splitting String str with a pattern 
        // (i.e )splitting the string whenever their 
        //  is whitespace and store in temp array. 
        String[] temp = pattern.split(str); 
        String result = ""; 
  
        // Iterate over the temp array and store 
        // the string in reverse order. 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
} 