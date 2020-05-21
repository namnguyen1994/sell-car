package car_dealership;

public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicles vehicle) {
		if((finance == true)) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnhand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnhand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more money ot purchase vehicle: " + vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicles vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle + "for the price " + vehicle.getPrice());
	}
}
