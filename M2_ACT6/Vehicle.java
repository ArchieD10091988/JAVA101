package module2.seatwork6;

public abstract class Vehicle {

	private String brand;
	private int numberOfWheels = 4;
	
	public Vehicle () {
		
	}
	
	public Vehicle(String name, int num) {
		this.brand = name;
		this.numberOfWheels  = num;
		
	}
	
	public void destroy() {
		System.out.println("The Vehicle is destroyed!!!!");
		
	}
	abstract void startEngine();
   
	public void setBrand(String name) {
		this.brand = name;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setNWheels(int num) {
		this.numberOfWheels = num;
	}
	
	public int getNWheels() {
		return numberOfWheels;
	}

}
