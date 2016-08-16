package paymentTypes;

public class Payment {

	public final double tax = 0.06;
	private double subTotal; 

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}



	

	public double calcGrandTotal() {
		double grandTotal = 0.0;
		grandTotal = getSubTotal() * (1 + tax);
		return grandTotal;
	}

	public double calcSalesTax() {
		double salesTax = getSubTotal() * tax;
		return salesTax;
	}
}
