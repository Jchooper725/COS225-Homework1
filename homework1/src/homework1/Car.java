package homework1;

public class Car {

	public String make;
	public String color;
	public boolean handicap;
	
	public Car() {
		this.make = "";
		this.color = "";
		this.handicap = false;
	}
	
	public Car(String make, String color, boolean handicap) {
		this.make = make;
		this.color = color;
		this.handicap = handicap;
	}
}
