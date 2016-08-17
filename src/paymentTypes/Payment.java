package paymentTypes;

import java.text.DecimalFormat;

public class Payment {

	public final double tax = 0.06;
	private double subTotal; 

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

public String formatNumber(double number) {
	DecimalFormat df = new DecimalFormat("#.00");
	String formattedNumber=df.format(number);
	return formattedNumber;
	
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
