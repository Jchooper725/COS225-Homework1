package homework1;

public class ParkingTester {

	public static void main(String[] args) {
		
		ParkingLot lot = new ParkingLot();
		Car car1 = new Car("Blue", "Infiniti", true);
		Car car2 = new Car("Black", "Cadiliac", false);
		
		System.out.println(lot);
		
		lot.parkCar(car1);
		
		System.out.println(lot);
		
		lot.parkCar(car2);
		
		System.out.println(lot);
		
		lot.removeCar(0);
		
		System.out.println(lot);
	}

}
