package src.stringquestion.copystring.customTreadpool;

class Count
{
	int count;
}
public class FindOccuranceOfWordInMatrix {
	static int rowNum[] = {-1, -1, -1, 0, 0, 1, 1, 1}; 
	static int colNum[] = {-1, 0, 1, -1, 1, -1, 0, 1}; 
	  static int count=0;
	public static void main(String[] args) {
	char[] [] mat = new char[3][5];
		/* mat = {{'B', 'N', 'E', 'Y', 'S'}, 
                {'H', 'E', 'D', 'E', 'S'}, 
                {'S', 'G', 'N', 'D', 'E'} 
              };*/
		mat= new char[][]
		{
				 {
					 'B','N','E','y','S'
					 
				 },
				 {
					 'H', 'E', 'D', 'E', 'S'
				 },
				 {
	
					 'S', 'G', 'N', 'D', 'E'
				 }
				 
		 };
		 

String word ="DES"; 
		
findOccurance(mat,word);
	}
	
	public static void findOccurance(char[][] mat,String word)
	{
		Count count = new Count();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(mat[i][j] == word.charAt(0))
				{
					findOccuranceUtil(mat,word,i,j,-1,-1,0,count);
				}
			}
		}
		System.out.println(count.count);
	}
	
	public static boolean isValid(int row,int col,int prevRow,int prevCol)
	{
		if(row>=0 && row<3 &&  col >=0 && col<5 && !(row == prevRow && col == prevCol))
			return true;
		return false;
	}
	public static void findOccuranceUtil(char[][] mat,String word,int row,int col,int prevRow,int prevCol,int index,Count count)
	{
		if(index>word.length() || mat[row][col] != word.charAt(index))
			return;
		System.out.println(word.charAt(index)+" i->"+row+ " col->"+col);
		if(index == word.length())
			{
//			/count.count++;
			return ;
			}
		
		for(int k=0;k<8;++k)
		{
			if(isValid(row, col, row+rowNum[k], row+colNum[k]))
			{
				findOccuranceUtil(mat, word, row, col, row+rowNum[k], row+colNum[k], index+1,count);
			}
		}
			
	}
}
