package com.practise.structural.BuilderPattern;

class Computer
{
	String ram;
	String hdd;
	boolean isGraphic;
	boolean iscamera;
	
	
	
	public Computer(ComputerBuilder builder)
	{
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.iscamera = builder.iscamera;
		this.isGraphic = builder.isGraphic;
	}
	
		static class ComputerBuilder
		{
			String ram;
			String hdd;
			boolean isGraphic;
			boolean iscamera;
			
			ComputerBuilder(String ram,String hdd)
			{
				this.ram = ram;
				this.hdd = hdd;
			}


			public ComputerBuilder setGraphic(boolean isGraphic) {
				this.isGraphic = isGraphic;
				return this;
			}

			public ComputerBuilder setIscamera(boolean iscamera) {
				this.iscamera = iscamera;
				return this;
			}
			
			public Computer build()
			{
				return new Computer(this); 
			}
			
		}

		@Override
		public String toString() {
			return "Computer [ram=" + ram + ", hdd=" + hdd + ", isGraphic=" + isGraphic + ", iscamera=" + iscamera
					+ "]";
		}
		
		
	
}
public class BuilderPatternTest {

	public static void main(String[] args) {
		
		Computer obj = new Computer.ComputerBuilder("5hdd","350").setGraphic(true).build();
		System.out.println(obj.toString());
	}
}
