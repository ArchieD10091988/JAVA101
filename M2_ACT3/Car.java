package module2.seatwork3;

public class Car {
	private String modelName; //model of the car
	private int travelDistance, fuelUsed;
	
	public Car(String name, int travel, int fuel) { //parameterized constructor
		this.modelName = name;
		this.travelDistance = travel;
		this.fuelUsed = fuel;
		
		
	}
	
	public Car() { //no args constructor
		
	}
	
	public void setModelName(String name) {
		this.modelName = name;
	}
	
	public String getModelName() {
		return modelName;
	}
	double mileage(int travelDistance, int fuelUsed) {   
		double result=0;
		
		result = fuelUsed / travelDistance;
		
		return result;
	}
}
