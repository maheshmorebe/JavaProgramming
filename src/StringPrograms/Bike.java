package StringPrograms;

public class Bike {

		String model;	// global/instance variables
		String color;
		
		public void bike(String model, String color)
		{
			this.model=model;
			this.color=color;
		}
	
		public void displayInfo()
		{
			System.out.println("Model:"+model+" Color:"+color);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1 = new Bike();
		Bike b2 = new Bike();

		b1.bike("Pulsor","Black");
		b2.bike("CBZ","Red");
		
		b1.displayInfo();
		b2.displayInfo();

		
	}

}
