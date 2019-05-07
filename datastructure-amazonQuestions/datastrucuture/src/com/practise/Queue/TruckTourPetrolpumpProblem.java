package com.practise.Queue;

public class TruckTourPetrolpumpProblem {
	
	static class PetrolPump
	{
		int petrol;
		int distance;
		
		public PetrolPump(int petrol, int distance) {
			// TODO Auto-generated constructor stub
			this.petrol = petrol;
			this.distance = distance;
		}
	}
	
	public void findStartOfTour(PetrolPump[] a)
	{
		int start=0;
		int end =1;
		int cur_petrol = a[0].petrol- a[0].distance;
		while(start!=end)	
		{
			while(cur_petrol<0 && start!=end)
			{
				cur_petrol-=a[start].petrol-a[start].distance;
				start=(start+1)%a.length;
				if(start == 0)
					{
					System.out.println(" not possible");
					return;
						}
			}
			cur_petrol+=a[end].petrol-a[end].distance;
			end=(end+1)%a.length;
		}
		
		System.out.println(start);
	}
	
	public static void main(String[] args) {
		PetrolPump[] arr = {new PetrolPump(6, 4), 
                new PetrolPump(3, 6), 
                new PetrolPump(7, 3)}; 
		
		TruckTourPetrolpumpProblem obj = new TruckTourPetrolpumpProblem();
		obj.findStartOfTour(arr);
	}
}
