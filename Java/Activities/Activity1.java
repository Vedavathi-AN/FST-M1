package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Hector = new Car();
		Hector.make = 2014;
		Hector.color = "Black";
		Hector.transmission = "Manual";
    
        //Using Car class method
		Hector.displayCharacterstics();
		Hector.accelerate();
		Hector.brake();
	}

}
