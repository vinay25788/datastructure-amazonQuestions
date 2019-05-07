import java.util.Arrays;

public class MinimumRoomForMeeting {
	public static void main(String[] args) {
		int[][] a= {
				{
					1,4
				},
				{
					5,6
				},
				{
					8,9
				},
				{
					2,6
				}
		};
		findRooms(a);
	}
	public static void findRooms(int[][] a)
	{
		int start[] = new int[a.length];
		int end[] = new int[a.length];
		int i=0;
		for(int[] el:a)
		{
			start[i] = el[0];
			end[i] = el[1];
			i++;
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int min=1;
		 i=1;
		 int j=0;
		 int mini=1;
		for( i=1;i<start.length&& j<start.length;i++,j++)
		{
			if(start[i]<=end[j])
			{
				min++;
				i++;
				if(min>mini)
				{
					mini=min;
				}
				
			}
			else if(start[i]>end[j])
			{
				j++;
				min--;
			}
			else
			{
				i++;
				j++;
			}
		}
		System.out.println(mini);
	}

}
