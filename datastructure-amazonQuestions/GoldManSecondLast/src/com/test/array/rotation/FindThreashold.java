package com.test.array.rotation;

import java.util.ArrayList;
import java.util.List;

public class FindThreashold {
	
	public static void main(String[] args) {
		List<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		int val=check(4,a);
	}
	
	public static int check(int thres ,List<Integer> list)
	{
		int[] a  = list.stream().mapToInt(i->i).toArray();
        int result=-1;
        int ind = binary(a, 0, list.size(), thres);

       
       
        if(ind== -1)
        {
          result = a.length;
        }
        else
        {
        	 int dif = a[ind]-a[0];
            if (dif >= thres)
                result= ind - 1;
        }

        return result;
        
        
	}
	public static int binary(int[] a,int l,int h,int key)
	{
		if(l>h)
		{
			return -1;
		}
		int mid = (l+h)/2;
		if(Math.abs(a[0]-a[mid])>=key)
			return mid;
		if(key>a[mid])
		{
			return binary(a, mid+1, h, key);
		}
		else
		{
			return binary(a, l, mid-1, key);
		}
		
	}
	public static int find(int[] a,int key)
	{
		int l=0;
		int h=1;
		int dif = a[h]-a[l];
		while(dif<key && h<a.length)
		{
			
			h=h+1;
			
			dif = a[h]-a[0];
		}
		return h-1;
	}

}
