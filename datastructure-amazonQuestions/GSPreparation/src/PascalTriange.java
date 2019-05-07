/* Problem Name is &&& Pascals Triangle &&& PLEASE DO NOT REMOVE THIS LINE. */

/*
==  Instructions ==
**  The below pattern of numbers are called Pascals Triangle.
**
**  Pascals Triangle exhibits the following behaviour:
**
**  The first and last numbers of each row in the triangle are 1
**  Each number in the triangle is the sum of the two numbers above it.
**
**  Example:
**    1
**    1 1
**    1 2 1
**    1 3 3 1
**
**  Please Complete the 'pascal' function below so that given a
**  col and a row it will return the value in that positon.
**
**  Example, pascal(1,2) should return 2
**
*/

import java.util.HashMap;
import java.util.Map;

/*import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;*/

public class PascalTriange {
   /*Asserts on value returned from pascal */
/*  @Test public void doTestsPass(){
  Assert.assertTrue(PascalTriange.pascal(0,0) ==  1);
  Assert.assertTrue(PascalTriange.pascal(1,2) ==  2);
  Assert.assertTrue(PascalTriange.pascal(5,6) ==  6);
  Assert.assertTrue(PascalTriange.pascal(4,8) ==  70);
  Assert.assertTrue(PascalTriange.pascal(6,6) ==  1);
  }*/

  public static Map<Integer, Map<Integer, Integer>> pascalHash = new HashMap<>();

  public static  int pascal(int col, int row){
    if(col == 0 || col == row) {
      return 1;
    }
    int pascalValue = 0;
    if(pascalHash.containsKey(col)){
      if(pascalHash.get(col).containsKey(row)){
        return pascalHash.get(col).get(row);
      }
      else{
        pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
        pascalHash.get(col).put(row,pascalValue);
      }
    }
    else{
      pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
      Map<Integer, Integer> rowHashMap = new HashMap();
      rowHashMap.put(row,pascalValue);
      pascalHash.put(col,rowHashMap);
    }
    return pascalValue;
  }

  public static void main(String[] args) {
 // JUnitCore.main("Solution");
	  System.out.println(pascal(5, 6));
  }
}