import java.util.HashMap;
import java.util.Map;

public class CycleLength {

	public static void main(String[] args) {
		int[] a= {1, 2, 0};
		findLenth(a);
	}
	public static void findLenth(int[] a)
	{
		Map<Integer ,Integer> map = new HashMap<>();
		int index=0;
		int count=1;
		
		while(!map.containsKey(index))
		{
			if(a[index]>a.length)
			{
				break;
			}
			map.put(index, count);
			count++;
			index = a[index];
		}
		System.out.println(count-map.get(index));
	}
}
