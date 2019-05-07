package com.practise.stack;




import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class solution
{
 
 static class Subject implements Comparable<Subject>
 {
    String subject;
     String time;
     
     Subject(String sub,String date2)
     {
         this.subject = sub;
         this.time  = date2;
     }
     
     public String toString()
     {
         return ""+this.subject+" "+this.time;
     }

	@Override
	public int compareTo(Subject o) {
		// TODO Auto-generated method stub
	String[] time =this.time.split(":");
		
		int hour=Integer.valueOf(time[0]);
		int mint = Integer.valueOf(time[1]);
		
		String[] time2 = o.time.split(":");
		int hour2 = Integer.valueOf(time2[0]);
		int mint2 = Integer.valueOf(time2[1]);
		if(hour-hour2<0 )
			return -1;
		
		if(hour == hour2 && mint-mint2<0 )
			return -1;
		
		return 1;
	}
 }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in );
        int daysNumber = sc.nextInt();
        int  NumberOfSubject= sc.nextInt();
        Subject[] subject = new Subject[NumberOfSubject];
        Set<Subject> set= new TreeSet<Subject>();
        for(int i=0;i<daysNumber;i++)
        {
            for(int j=0;j<NumberOfSubject;j++)
            {
                String subName = sc.next();
            //	int hour=sc.nextInt();
            	String time = sc.next();
            	
            //	LocalTime time = LocalTime.of(hour, mint);
            	subject[j]= new Subject(subName,time);
            	
                set.add(subject[j]);
                
            }
            System.out.println(findCount(set,subject));
        }
        
       
     
    }
    public static int findCount(Set<Subject> set,Subject[] subject)
    {
    	    int count =0;
           int i=0;
           for(Subject sub:subject)
           {
           	subject[i++] =sub; 
           }
           for(int t=0;t<subject.length-1;t++)
           {
        	   String[] time =subject[t+1].time.split(":");
       		
       		int hour=Integer.valueOf(time[0]);
       		int mint = Integer.valueOf(time[1]);
       		
       		String[] time2 = subject[t].time.split(":");
       		int hour2 = Integer.valueOf(time2[0]);
       		int mint2 = Integer.valueOf(time2[1]);
           	if(hour-hour2>0 || mint-mint2>0)
           		count++;
           }
           return count;
    }
}