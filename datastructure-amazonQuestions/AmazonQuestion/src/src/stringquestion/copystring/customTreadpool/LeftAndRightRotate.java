package src.stringquestion.copystring.customTreadpool;

public class LeftAndRightRotate {

	public static void main(String[] args) {
		String st ="vinay";
		int left = 3;
		int right = 3;
		char[] ch = st.toCharArray();
		leftRotate(ch,left);
		st = String.valueOf(ch);
		System.out.println(st);
		st ="vinay";
		ch = st.toCharArray();
		rightRotate(ch,right);
		st = String.valueOf(ch);
		System.out.println(st);
		
	}
	
	public static void rightRotate(char[] ch,int d)
	{
		leftRotate(ch, ch.length-d);
	}
	public static void leftRotate(char[] ch,int d)
	{
		reverse(ch,0,d-1);
		reverse(ch,d,ch.length-1);
		reverse(ch,0,ch.length-1);
	}
	
	public static void reverse(char[] ch,int l,int h)
	{
		char temp=0;
		while(l<h)
		{
			temp = ch[l];
			ch[l] = ch[h];
			ch[h] = temp;
			h--;
			l++;
		}
	}
}
