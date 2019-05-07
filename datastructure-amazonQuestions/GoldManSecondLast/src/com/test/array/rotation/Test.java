package com.test.array.rotation;


//JAVA Code For Minimum operation to make 
//all elements equal in array 
import java.util.*; 

public class Test { 
	
	// function for min operation 
	public static void main(String[] args) {
		System.out.println(minMoves(123));
	}
	
	public static int minMoves(int nums) {
        int sum = 0;
        int minNum = 2147483647;
        int count=0;
      
        //> calculate the sum and find the min value
       while(nums>0) {
    	   int rem = nums%10;
    	   count++;
    	   nums = nums/10;
            sum += rem;
            if(rem < minNum) {
                minNum = rem;
            }
        }
        
        return (sum - minNum * count);
    }
} 
	
//This code is contributed by Arnav Kr. Mandal. 
