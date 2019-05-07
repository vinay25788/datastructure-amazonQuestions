package com.generic;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
    	
      List<Integer> list2 =  (List<Integer>) list.stream().sorted().collect(Collectors.toList());
      int result =list2.get(list.size()-1)+list2.get(list.size()-2);
       
      
//       int result = list.get(list.size()-1)+list.get(list.size()-2);
       return 0;
       
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}