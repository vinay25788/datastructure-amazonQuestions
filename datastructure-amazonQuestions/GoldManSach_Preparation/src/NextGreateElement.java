import java.util.Stack;

public class NextGreateElement {
	
	public static void main(String[] args) {
		int a[] = { 11, 13, 21, 3 }; 
		find(a);
	}
	public static void find(int[] a)
	{
		Stack<Integer> st = new Stack<>();
		st.push(a[0]);
		
		int el=0;
		for(int i=1;i<a.length;i++)
		{
			int next = a[i];
			if(st.isEmpty() == false)
			{
				el = st.pop();
				while(el<next)
				{
					System.out.println(el+"--"+next);
					if(st.isEmpty()==true)
						break;
					el =st.pop();
				}
				if(el>next)
					st.push(el);
			}
			st.push(next);
		}
		while(st.isEmpty() == false)
		{
			System.out.println(st.pop()+" "+"-1");
		}
	}

}
