/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
import java.util.HashMap;
import java.util.Map;

public class PascalTriangel {
 
  public static Map<Integer, Map<Integer, Integer>> pascalHash 
  = new HashMap<Integer,Map<Integer,Integer>>();

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
	  if(PascalTriangel.pascal(0,0) ==  1 &&
			  PascalTriangel.pascal(1,2) ==  2 &&
			  PascalTriangel.pascal(5,6) ==  6 &&
			  PascalTriangel.pascal(4,8) ==  70 &&
			  PascalTriangel.pascal(6,6) ==  1) {
		  System.out.println("Pass");		  
	  }else {
		  System.out.println("Failed");
	  }
  }
}
