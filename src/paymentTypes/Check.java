//testing
package paymentTypes;

public class Check extends Payment {

	private int checkNumber;

	
	public int getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	/*@Override
	public double calcSubtotal() {
		double subtotal = 0.0;
		subtotal = getPrice() * getQuantity();
		return subtotal;
	}

	@Override
	public double calcGrandTotal() {
		double grandTotal = 0.0;
		grandTotal = getPrice() * getQuantity() * (1 + tax);
		return grandTotal;
	}

	@Override
	public double calcSalesTax() {
		double salesTax = calcSubtotal() * tax;
		return salesTax;
	}*/
		
		
}
