package module2.seatwork3;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car avanza = new Car();
		Car elantra = new Car("Hyundai",100,1000);
		
		double getMileage = elantra.mileage(100, 1000);
		
		avanza.setModelName("Toyota");
		
		System.out.println("The avanza model is : " + avanza.getModelName());
		
		System.out.println("The elantra model is : " + elantra.getModelName());
		
		System.out.println("The milege is : " + getMileage);
		
		
	}

}
