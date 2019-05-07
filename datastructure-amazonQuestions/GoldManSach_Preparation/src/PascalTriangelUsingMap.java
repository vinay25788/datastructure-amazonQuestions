import java.util.HashMap;
import java.util.Map;

public class PascalTriangelUsingMap {
	static Map<Integer,Map<Integer,Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		System.out.println(findPascalVal(2,5));
	}
	public static int findPascalVal(int col,int row)
	{
		if(col==0 || col== row)
			return 1;
		if(map.containsKey(col))
		{
			if(map.get(col).containsKey(row))
			{
				return map.get(col).get(row);
			}
			else
			{
				int value = findPascalVal(col, row-1)+findPascalVal(col-1, row-1);
				map.get(col).put(row, value);
			}
		}
		else
		{
			
			int val = findPascalVal(col, row-1)+findPascalVal(col-1, row-1);
			Map<Integer,Integer> rowMap = new HashMap<>();
			rowMap.put(row, val);
			map.put(col, rowMap);
		}
		return map.get(col).get(row);
		
	}

}
