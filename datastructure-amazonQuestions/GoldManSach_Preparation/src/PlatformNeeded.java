import java.util.Arrays;

public class PlatformNeeded {
	public static void main(String[] args) {
		  int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
		    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
		    
		    findStation(arr,dep);
	}
	public static void findStation(int[] arr,int[] dep)
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int stationNeeded =1;
		int i=1;
		int j=0;
		int max=1;
		while(i<arr.length && j<dep.length)
		{
			if(arr[i]<=dep[j])
			{
				stationNeeded++;
				i++;
				if(max<stationNeeded)
					max = stationNeeded;
			}
			else
			{
				stationNeeded--;
				j++;
			}
			if(max<stationNeeded)
				max = stationNeeded;
		}
		System.out.println(max);
	}
}
