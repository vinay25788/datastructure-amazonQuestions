
public class StairCaseSimple {
	public static void main(String[] args) {
		count(3);
	}
	public static void count(int n)
	{
		int[] way = new int[n+1];
		way[1] =1;
		way[2] = 2;
		//way[3] =3;
		for(int i=3;i<=n;i++)
		{
			way[i] = way[i-1]+way[i-2];
			
		}
		System.out.println(way[n]);
	}
}
