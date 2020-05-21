package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("Nam");
		cust1.setAddress("0123 Blah St.");
		cust1.setCashOnhand(25000);
		
		Vehicles vehicle = new Vehicles("Toyota", "Camry", 20000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
	}

}
