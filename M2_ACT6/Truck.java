package module2.seatwork6;

public class Truck extends Vehicle implements Refuelable {

	public Truck(String name, int num) {
		this.setBrand(name);
		this.setNWheels(num);
	}
	
	@Override
	public void destroy() {
		System.out.println("The Truck is destroyed!!!");
		
	}

	@Override
	public void startEngine() {
		System.out.println(this.getBrand()+ "  Start your engine... with " + this.getNWheels() + " wheels!");
		
	}

	
	@Override
	public void refuel() {
		System.out.println("Refuel : " + this.getBrand());
		
	}
	
	
}
