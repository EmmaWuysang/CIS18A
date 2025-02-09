package storefront;

interface Order { // choice of delivery
	public void processOrd(); // processing order message
	public double extFees(double Extra); // the extra fees for delivery or in person
}