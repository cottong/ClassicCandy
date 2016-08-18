package posMain;

import java.text.DecimalFormat;

public class Receipt {
private int quantity;
private double price;
private String candyName;
private double subTotal;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCandyName() {
	return candyName;
}
public void setCandyName(String candyName) {
	this.candyName = candyName;
}
public double getSubTotal() {
	return subTotal;
}
public void setSubTotal(double subTotal) {
	this.subTotal = subTotal;
}

public Receipt(String candyName, int quantity, double price, double subTotal){
	setCandyName(candyName);
	setQuantity(quantity);
	setPrice(price);
	setSubTotal(subTotal);
}



}
