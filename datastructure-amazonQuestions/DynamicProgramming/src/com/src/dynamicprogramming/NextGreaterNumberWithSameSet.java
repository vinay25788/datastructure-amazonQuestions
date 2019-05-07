package com.src.dynamicprogramming;



import java.util.Arrays;

public class NextGreaterNumberWithSameSet {

       public static void main(String[] args) {
              //char[] digit = { '5','3','4','9','7','6' };//4321
              //char[] digit = {'4', '3', '2', '1'};
              char[] digit = {'4', '6', '7', '2'};
              int len = digit.length;
              
              findNextGreater(digit, len);

       }
       
       private static void findNextGreater(char[] digit, int len) {
              
              int i;
              for(i = len-1; i > 0; i--) {
                     if(digit[i-1] < digit[i]) { //{'4', '6', '7', '2'};
                           break;
                     }
              }
              char x=' ';
              if(i == 0) {
                     System.out.println("Next greater number is not possible");
              } else {
                      x = digit[i-1]; int min = i;
                     // II) Find the smallest digit on right  
            // side of (i-1)'th digit that is greater  
            // than number[i-1] 
                     for(int j = i+1; j < len; j++) {
                           if(digit[j] > x && digit[j] < digit[min]) {
                                  min = j;
                           }
                     }
                     
                     char temp = (char) digit[min];
            digit[min]= x;
            digit[i-1] = temp;
            //Arrays.sort(digit, i, len-1);
            
            Arrays.sort(digit, i, len);
         
            System.out.println(Arrays.toString(digit));

              }
              
              
       }

}


