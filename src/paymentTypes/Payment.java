package paymentTypes;

public class Payment {
	private double price;
	private int quantity;
	public final double tax = 0.06;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calcSubtotal() {
		double subtotal = 0.0;
		subtotal = getPrice() * getQuantity();
		return subtotal;
	}

	public double calcGrandTotal() {
		double grandTotal = 0.0;
		grandTotal = getPrice() * getQuantity() * (1 + tax);
		return grandTotal;
	}

	public double calcSalesTax() {
		double salesTax = calcSubtotal() * tax;
		return salesTax;
	}
}
