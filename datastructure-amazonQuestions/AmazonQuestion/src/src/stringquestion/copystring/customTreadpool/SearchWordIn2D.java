package src.stringquestion.copystring.customTreadpool;

public class SearchWordIn2D {
	static int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 }; 
	static int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 }; 
	public static void main(String[] args) {
		//char grid[][] = new char[3][14];
		char[][] grid = {
			{'G','E','E','K','S','F','O','R','G','E','E','K','S'}, 
            {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'}, 
            {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}
               
	};
		
		String word ="GEEKS";
		search(grid,word);

}
	public static boolean searchWordInGrid(char[][] grid,String word,int row,int col)
	{
		if(grid[row][col] != word.charAt(0))
			return false;
		int len = word.length();
		int i;
		for( i=0;i<8;i++)
		{
			int k,rd = row+x[i],cd=col+y[i];
			for(k=1;k<len;k++)
			{
				if(rd<0 || rd>=3 || cd<0 || cd>=13)
				{
					break;
				}
				if(grid[rd][cd] != word.charAt(k))
					break;
				
				rd+=x[i];
				cd+=y[i];
			}
			if(k== len)
				return true;
		}
		
		
		
		return false;
	}
	
	public static void search(char[][] grid,String word)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<13;j++)
				if(searchWordInGrid(grid,word,i,j))
					System.out.println("word found at row "+i+" col  "+j);
		}
	}
}
