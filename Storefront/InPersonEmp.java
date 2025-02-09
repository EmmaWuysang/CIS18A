package storefront;

class InPersonEmp implements Order{ // choice of delivery
	public void processOrd(){
	System.out.println("Your order is currently being processed in real time by our employee Bianca and will be your guide in-store for pickup. . .");
	}

	@Override
	public double extFees(double Extra){
		double Inpersonfee = 0; // base delivery is $0 since in person
		return Inpersonfee;
	}
}