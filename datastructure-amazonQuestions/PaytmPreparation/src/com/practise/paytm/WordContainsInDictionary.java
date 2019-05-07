package com.practise.paytm;



import java.util.HashSet;
import java.util.Set;

/******
* Given a string and a dictionary, split this string into multiple words such that
*  each word belongs in dictionary
*
* ex-Consider the following dictionary
* { i, like, sam, sung, samsung, mobile, ice,
*   cream, icecream, man, go, mango}
*
* Input:  ilike
* Output: Yes
* The string can be segmented as "i like"
*
* Problem solved using DP..
*/

public class WordContainsInDictionary {

    public static void main(String args[]) {
        Set<String> dictionary = new HashSet<>();

        dictionary.add("I");
        dictionary.add("like");
        dictionary.add("had");
        dictionary.add("play");
        dictionary.add("to");

        String str = "Ihadliketoplay";
        //   String str = "Ilike";

        boolean result = breakWordDP(str, dictionary);

        System.out.println("Word present in dictionary :" + result);
    }

    public static boolean breakWordDP(String word, Set<String> dict) {

        Boolean[][] T = new Boolean[word.length()][word.length()];
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = false;
            }
        }

        //fill up matrix

        //first outer loop is for word length ,start from 1 and go till lenght of word..
        for (int l = 1; l <= word.length(); l++) {
            for (int i = 0; i < word.length() - l + 1; i++) {
                int j = i + l - 1;
                String str = word.substring(i, j + 1);
                if (dict.contains(str)) {
                    T[i][j] = true;     //if substring from i to j contains in dict then mark as true..
                    continue;
                }

                //find  k b/w i+1 and j such that T[i][k-1] && T[k][j] are both true

                for (int k = i + 1; k <= j; k++) {
                    if (T[i][k-1 ] == true && T[k][j] == true) { //if both before k and after k is true then T[i][j]=true
                        T[i][j] = true;
                    }
                }

            }
        }

        return T[0][word.length() - 1];
    }
}




