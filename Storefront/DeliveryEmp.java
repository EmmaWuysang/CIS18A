package storefront;

class DeliveryEmp implements Order { // choice of delivery
	public void processOrd(){
	System.out.println("Your order is currently being processed in real time by our employee Tom and will be delivered by him. . .");
	}

	@Override
	public double extFees(double Extra){
		double deliveryFee = 5;; // base delivery is $5
		return deliveryFee;
	}
}