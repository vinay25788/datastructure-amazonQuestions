

class Building
{
	String name;
	String floor;
	String  bhk;
	boolean parking;
	boolean swimmingPool;
	boolean gym;
	
	public Building(BuildingBuilder builder)
	{
		this.name = builder.name;
		this.bhk = builder.bhk;
		this.parking = builder.parking;
		this.gym = builder.gym;
		this.swimmingPool = builder.swimmingPool;
		this.floor = builder.floor;
	}
	
	static class BuildingBuilder
	{
		String name;
		String floor;
		String  bhk;
		boolean parking;
		boolean swimmingPool;
		boolean gym;
		
		public BuildingBuilder(String name,String floor, String bhk,boolean parking)
		{
			this.name = name;
			this.floor = floor;
			this.bhk = bhk;
			this.parking = parking;
			
		}
		
		public BuildingBuilder setSwimmingPool(boolean swinm)
		{
			this.swimmingPool = swinm;
			return this;
		}
		
		public BuildingBuilder setGym(boolean gym)
		{
			this.gym = gym;
			return this;
		}

		
		
		public Building build()
		{
			return new Building(this);
		}
	}

	@Override
	public String toString() {
		return "Building [name=" + name + ", floor=" + floor + ", bhk=" + bhk + ", parking=" + parking
				+ ", swimmingPool=" + swimmingPool + ", gym=" + gym + "]";
	}
	
	
}
public class BuilderDesigndemo {

	public static void main(String[] args) {
	
		Building building = new Building.BuildingBuilder("sapient", "10th", "2bhk", true).setGym(true).build();
	System.out.println(building.toString());	
	}
	
 
}
