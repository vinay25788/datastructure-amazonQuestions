package src.stringquestion.copystring.customTreadpool;

public class SpiralMatrix {

	public static void main(String[] args) {
		//int R = 3; 
        //int C = 6; 
        int a[][] = { {1,  2,  3,  4,  5,  6}, 
                      {7,  8,  9,  10, 11, 12}, 
                      {13, 14, 15, 16, 17, 18} 
                    }; 
        int R = a.length;
        int C = a[0].length;
        System.out.println(R +" " + C);
        spiralPrint(a,R,C); 
	}
	
	public static void spiralPrint(int[][] a,int ROW,int COL)
	{
		int r=0,c=0,i=0;
		while(r<ROW && c<COL)
		{
			for(i=c;i<COL;i++)
				System.out.print(" "+a[r][i]);
			r++;
			
			for(i=r;i<ROW;i++)
				System.out.print(" "+a[i][COL-1]);
			COL--;
			
			if(r<ROW-1) {
			for(i=COL-1;i>=c;i--)
				System.out.print(" "+a[ROW-1][i]);
			ROW--;
			}
			if(c<COL-1) {
			for(i=ROW-1;i>=r;i--)
				System.out.print(" "+a[i][c]);
			c++;
			
			}
		}
	}
}
