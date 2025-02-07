package homework1;

public class ParkingLot {

	public ParkingSpot lot[];
	
	public ParkingLot() {
		this.lot = new ParkingSpot[8];
		this.lot[0] = new ParkingSpot(true);
		this.lot[1] = new ParkingSpot(true);
		for (int i = 2; i < 8; i++) {
			this.lot[i] = new ParkingSpot(false);
		}
	}
	
	public int parkCar(Car car) {
		for(int i = 0; i < 8; i++) {
			if(car.handicap == lot[i].handicap) {
				if(lot[i].car == null) {
					lot[i].car = car;
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public Car removeCar(int i) {
		Car retCar = lot[i].car;
		lot[i].car = null;
		return retCar;
	}
	
	public String toString() {
		int t = 0;
		int f = 0;
		for(int i = 0; i < 8; i++) {
			if (lot[i].car == null && lot[i].handicap == true ) {
				t++;
			} else if (lot[i].car == null && lot[i].handicap == false) {
				f++;
			}
		}
		
		return t + " " + f;
	}
}
