package module2.seatwork6;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Mitsu = new Car("MyMitsu",4);
		Truck Coke = new Truck("MyCoke",8);
		
		Mitsu.startEngine();
		Coke.startEngine();
		
		Mitsu.refuel();
		Coke.refuel();
		
		destroyVehicle(Coke);
		destroyVehicle(Mitsu);
		
	}

	
	private static void destroyVehicle(Truck mytruck) {
		
		mytruck.destroy();
	}
	
	private static void destroyVehicle(Car mytruck) {
		
		mytruck.destroy();
	}

}
