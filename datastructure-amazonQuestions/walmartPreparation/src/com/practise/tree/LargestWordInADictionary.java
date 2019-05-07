package com.practise.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestWordInADictionary {

                public static void main(String[] args) {
                                
                                String dictionary1[] = { "to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana" };
                              String str1 = "dsetog";
                               // String str1 = "abcdtosfdes";
                                //String str3 = longestWordInDictionary(dictionary1, str1);
                                //System.out.println(str1);
                                
                                String[] arr = {"ale", "apple", "monkey", "plea"}; 
        List<String> dict = new ArrayList<>(Arrays.asList(dictionary1)); 
        String str = "cdtbcoes"; 
        System.out.println(findLongestString(dict, str1));

                }

                private static String findLongestString(List<String> dict, String str) {
                                String maxLenWord = "";
                                int length = 0;
                                Set<String> set = new HashSet<>();
                                
                                for(String d : dict) {
                                               
                                	if(length<d.length() && isSubSequence(d, str))
                                	{
                                		length = d.length();
                                		System.out.println(d);
                                	}
                                }
                                
                                System.out.println(set);
                                return maxLenWord;
                }

                private static boolean isSubSequence(String word, String str) {
                                int m = word.length();
                                int n = str.length();
                                int j = 0;
                                for(int i = 0; i < n && j < m; i++) {
                                               if(word.charAt(j) == str.charAt(i))
                                               {
                                            	   j++;
                                               }
                                }
                                return (j == m);
                }

}



