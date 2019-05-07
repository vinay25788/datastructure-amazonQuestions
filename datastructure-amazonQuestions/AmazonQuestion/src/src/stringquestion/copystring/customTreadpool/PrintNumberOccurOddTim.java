package src.stringquestion.copystring.customTreadpool;

public class PrintNumberOccurOddTim {

	public static void main(String[] args) {
		 int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2}; 
		 int xor=ar[0];
		 for(int i=1;i<ar.length;i++)
			 xor =xor^ar[i];
		 System.out.println(xor);
	}
}
