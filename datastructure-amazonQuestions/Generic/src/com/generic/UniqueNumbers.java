package com.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumberss(Collection<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
  }

    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
    	Collection<Integer> list = numbers.stream().filter(i->Collections.frequency(numbers, i)==1).collect(Collectors.toSet());
		return list;
        
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
        Integer i;
        String st;
        
        System.out.println(findUniqueNumberss(numbers));
    }
}